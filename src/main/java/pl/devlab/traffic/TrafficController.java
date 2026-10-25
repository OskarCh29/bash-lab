package pl.devlab.traffic;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/traffic")
public class TrafficController {

    private final TrafficService trafficService;

    @GetMapping
    public Mono<TrafficStatusResponse> getRandomResponse() {
        return Mono.empty();
    }

    @GetMapping("/state")
    public Mono<TrafficStatusResponse> getTrafficStatus(){
        return Mono.empty();
    }

    @PutMapping("/state")
    public Mono<TrafficStatusResponse> adjustState(@RequestBody UpdateTrafficStateRequest request) {
        return Mono.empty();
    }

    @PostMapping("/stop")
    public Mono<TrafficStatusResponse> stopTraffic() {
        return Mono.empty();
    }
}
