---
id: "T-0074"
title: "Zdiagnozuj ImagePullBackOff"
module: "10-kubernetes"
level: 3
duration_minutes: 25
requires: ["T-0073"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0074 — Zdiagnozuj ImagePullBackOff

> Moduł: Kubernetes — wdrożenie i diagnoza · Poziom 3 · 25 min

## Misja

Deployment nie startuje mimo poprawnego wyglądu YAML. Ustal problem przez Events i nazwę obrazu.

## Cel nauki

Rozumieć pobieranie obrazu i dostępność lokalną w Minikube.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/kubernetes/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Użyj kontrolowanej błędnej nazwy obrazu
2. Zastosuj Deployment w namespace labowym
3. Obejrzyj describe i events
4. Popraw nazwę albo załaduj obraz
5. Potwierdź rollout

## Kryteria zaliczenia

- Diagnoza pochodzi z Events
- Po naprawie Pod jest gotowy
- Nie wyłączasz sond

## Weryfikacja

Sprawdź describe pod i rollout status

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Sprawdź nazwę i tag
2. **Kierunek:** Obraz hosta nie zawsze jest widoczny w Minikube
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Nie używaj prywatnych obrazów bez potrzeby
