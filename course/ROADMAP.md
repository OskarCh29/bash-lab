# Roadmapa kursu

| Etap | Moduł | Questów | Bramka umiejętności |
|---:|---|---:|---|
| 01 | [Start tutaj — terminal i diagnoza](lessons/00-start-here/) | 4 | Wyciągasz fakty z terminala i diagnozujesz bez zgadywania. |
| 02 | [Git — bezpieczna praca ze zmianami](lessons/01-git/) | 10 | Używasz status, diff, log, stash, restore/revert, branch, merge, rebase i bisect. |
| 03 | [Linux — pliki, procesy i sieć](lessons/02-linux/) | 7 | Zbierasz metadane, diagnozujesz procesy i analizujesz logi. |
| 04 | [Bash — automatyzacja](lessons/03-bash/) | 7 | Piszesz skrypty CLI z walidacją, backupem i healthcheckiem. |
| 05 | [Aplikacje przykładowe — Java jako materiał](lessons/04-app-fixtures/) | 4 | Uruchamiasz gotową Javę, rozumiesz proces port i konfigurację. |
| 06 | [HTTP — testowanie usług](lessons/05-http-services/) | 4 | Diagnozujesz kontrakt HTTP, statusy, błędy połączenia i timeouty. |
| 07 | [Integracja dwóch usług REST](lessons/06-service-integration/) | 4 | Uruchamiasz i diagnozujesz dwie zależne usługi REST. |
| 08 | [Docker — od obrazu do aplikacji](lessons/07-docker-compose/) | 9 | Budujesz obrazy i rozumiesz DNS porty wolumeny i healthchecki. |
| 09 | [CI/CD — automatyczne sprawdzanie](lessons/08-ci-cd/) | 5 | CI weryfikuje zmiany i bezpiecznie obsługuje konfigurację oraz release. |
| 10 | [Observability — Prometheus i Grafana](lessons/09-observability/) | 6 | Metryki PromQL dashboardy i alerty wspierają diagnozę. |
| 11 | [Kubernetes — wdrożenie i diagnoza](lessons/10-kubernetes/) | 9 | Wdrażasz na Minikube i diagnozujesz selektory obrazy zasoby i rollout. |
| 12 | [Helm i GitOps — Argo CD](lessons/11-helm-gitops/) | 6 | Parametryzujesz wdrożenia i naprawiasz synchronizację GitOps. |
| 13 | [Capstone — od kodu do klastra](lessons/12-capstone/) | 4 | Odtwarzasz środowisko od czystego klona i dokumentujesz incydent. |

## Przepływ aplikacji
1. Poznaj gotowe źródła task-api i profile-api.
2. Uruchom procesy i testuj je przez curl.
3. Napisz Dockerfile dla obu usług.
4. Połącz je przez Compose, service DNS i zmienne środowiskowe.
5. Dodaj CI, metryki Prometheus i dashboard Grafany.
6. Wdróż te same usługi do Minikube.
7. Zarządzaj konfiguracją przez Helm i Argo CD.

Java/Spring nie są osobnymi przedmiotami — gotowe API służą do zadań operacyjnych.
