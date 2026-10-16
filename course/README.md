# Java + DevOps Quest Lab

Praktyczny kurs krótkich questów terminalowych. Główny cel to DevOps: procesy, Linux, Git, sieci, Docker, CI/CD, monitoring, Kubernetes i GitOps. Java jest dostarczonym materiałem do ćwiczeń operacyjnych.

## Jak pracować
- Przechodź moduły w kolejności roadmapy.
- Jedna sesja zwykle trwa 15–30 minut.
- Każda lekcja ma task.md i materials/README.md. Wybrane lekcje mają result.md do wpisania wyników z terminala oraz solution/ na tworzone artefakty.
- solution/ nie zawiera gotowych odpowiedzi.
- Gdy utkniesz, pokaż AI wynik komendy i poproś o jeden następny eksperyment.
- Prywatny postęp zapisuj w Obsidianie.

## Moduły
1. **[Start tutaj — terminal i diagnoza](lessons/00-start-here/)** — Terminal i diagnoza bez zgadywania
2. **[Git — bezpieczna praca ze zmianami](lessons/01-git/)** — Historia, staging, stash, konflikty i odzyskiwanie pracy
3. **[Linux — pliki, procesy i sieć](lessons/02-linux/)** — Metadane, procesy, logi, połączenia i archiwa
4. **[Bash — automatyzacja](lessons/03-bash/)** — Skrypty CLI, walidacja, backupy i healthchecki
5. **[Aplikacje przykładowe — Java jako materiał](lessons/04-app-fixtures/)** — Gotowy kod, proces Java, porty i konfiguracja runtime
6. **[HTTP — testowanie usług](lessons/05-http-services/)** — curl, statusy, nagłówki, kontrakty i timeouty
7. **[Integracja dwóch usług REST](lessons/06-service-integration/)** — Zależności, upstream, awarie i ścieżka żądania
8. **[Docker — od obrazu do aplikacji](lessons/07-docker-compose/)** — Dockerfile, build context, Compose, networking i wolumeny
9. **[CI/CD — automatyczne sprawdzanie](lessons/08-ci-cd/)** — GitHub Actions, sekrety, artefakty i release
10. **[Observability — Prometheus i Grafana](lessons/09-observability/)** — Metryki, PromQL, dashboardy i alerty
11. **[Kubernetes — wdrożenie i diagnoza](lessons/10-kubernetes/)** — Minikube, Service, selektory, zasoby i rollout
12. **[Helm i GitOps — Argo CD](lessons/11-helm-gitops/)** — Szablony wdrożeń, synchronizacja i dryf
13. **[Capstone — od kodu do klastra](lessons/12-capstone/)** — Integracja, incydenty i dokumentacja

## Gotowe aplikacje REST
W course/fixtures/apps/ znajdują się task-api oraz profile-api, napisane w standardowym JDK bez Springa i zewnętrznych zależności. task-api wywołuje profile-api przez HTTP. Możesz uruchomić je lokalnie, a następnie tworzyć Dockerfile, łączyć usługi przez Compose i przenosić je na Kubernetes.

## Bezpieczeństwo
Kopiuj fixture do solution/ lub katalogu tymczasowego przed edycją. Konflikty Git ćwicz wyłącznie w kopii. Weryfikuj wyniki przez testy, curl, statusy, logi i events. Nie zapisuj sekretów ani danych produkcyjnych.
