import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

public final class TaskApi {
    private static final HttpClient CLIENT = HttpClient.newBuilder()
        .connectTimeout(Duration.ofSeconds(2)).build();

    public static void main(String[] args) throws IOException {
        int port = Integer.parseInt(System.getenv().getOrDefault("PORT", "8080"));
        HttpServer server = HttpServer.create(new InetSocketAddress("0.0.0.0", port), 0);
        server.createContext("/health", exchange -> {
            if (!"GET".equals(exchange.getRequestMethod())) {
                respond(exchange, 405, "{\"error\":\"method_not_allowed\"}");
                return;
            }
            respond(exchange, 200, "{\"status\":\"UP\",\"service\":\"task-api\"}");
        });
        server.createContext("/api/tasks", exchange -> {
            if (!"GET".equals(exchange.getRequestMethod())) {
                respond(exchange, 405, "{\"error\":\"method_not_allowed\"}");
                return;
            }
            respond(exchange, 200, "[{\"id\":1,\"title\":\"Prepare deployment\",\"status\":\"OPEN\"}]");
        });
        server.createContext("/api/tasks/with-owner", exchange -> {
            if (!"GET".equals(exchange.getRequestMethod())) {
                respond(exchange, 405, "{\"error\":\"method_not_allowed\"}");
                return;
            }
            String base = System.getenv().getOrDefault("PROFILE_API_URL", "http://localhost:8081");
            while (base.endsWith("/")) base = base.substring(0, base.length() - 1);
            try {
                HttpRequest request = HttpRequest.newBuilder(URI.create(base + "/api/profiles/1"))
                    .timeout(Duration.ofSeconds(3)).GET().build();
                HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() < 200 || response.statusCode() >= 300) {
                    respond(exchange, 502, "{\"error\":\"upstream_bad_status\",\"upstream_status\":" + response.statusCode() + "}");
                    return;
                }
                respond(exchange, 200, "{\"task\":{\"id\":1,\"title\":\"Prepare deployment\",\"status\":\"OPEN\"},\"owner\":" + response.body() + "}");
            } catch (InterruptedException interrupted) {
                Thread.currentThread().interrupt();
                respond(exchange, 502, "{\"error\":\"upstream_interrupted\"}");
            } catch (Exception failure) {
                respond(exchange, 502, "{\"error\":\"upstream_unavailable\"}");
            }
        });
        server.createContext("/", exchange -> respond(exchange, 404, "{\"error\":\"not_found\",\"service\":\"task-api\"}"));
        server.start();
        System.out.printf("task-api listening on port %d%n", port);
    }

    private static void respond(HttpExchange exchange, int status, String body) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", "application/json; charset=utf-8");
        exchange.sendResponseHeaders(status, bytes.length);
        try (OutputStream output = exchange.getResponseBody()) { output.write(bytes); }
    }
}
