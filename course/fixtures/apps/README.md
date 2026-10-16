# Dwie przykładowe usługi REST — bez Springa

To gotowe małe API w standardowym JDK. Kurs skupia się na uruchamianiu, diagnozowaniu, konteneryzacji, sieci i monitoringu, a nie na nauce składni Java.

- profile-api (domyślny port 8081): GET /health i GET /api/profiles/1.
- task-api (domyślny port 8080): GET /health, GET /api/tasks i GET /api/tasks/with-owner.
- task-api wywołuje profile-api przez HTTP. PROFILE_API_URL domyślnie wskazuje http://localhost:8081.
- Obie usługi pozwalają nadpisać port zmienną PORT.

## Linux / WSL2
Terminal 1:
    mkdir -p /tmp/profile-api-build
    javac --add-modules jdk.httpserver -d /tmp/profile-api-build course/fixtures/apps/profile-api/ProfileApi.java
    PORT=8081 java --add-modules jdk.httpserver -cp /tmp/profile-api-build ProfileApi

Terminal 2:
    mkdir -p /tmp/task-api-build
    javac --add-modules jdk.httpserver -d /tmp/task-api-build course/fixtures/apps/task-api/TaskApi.java
    PORT=8080 PROFILE_API_URL=http://localhost:8081 java --add-modules jdk.httpserver -cp /tmp/task-api-build TaskApi

Testy:
    curl -i http://localhost:8081/health
    curl -i http://localhost:8081/api/profiles/1
    curl -i http://localhost:8080/health
    curl -i http://localhost:8080/api/tasks
    curl -i http://localhost:8080/api/tasks/with-owner

Zatrzymuj własne procesy przez Ctrl+C.
