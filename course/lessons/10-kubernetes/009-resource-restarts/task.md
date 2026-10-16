---
id: "T-0076"
title: "Odczytaj restart i limity zasobów"
module: "10-kubernetes"
level: 4
duration_minutes: 30
requires: ["T-0075"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0076 — Odczytaj restart i limity zasobów

> Moduł: Kubernetes — wdrożenie i diagnoza · Poziom 4 · 30 min

## Misja

Pod restartuje się pod obciążeniem. Zbierz dane, zamiast od razu zwiększać limity.

## Cel nauki

Rozróżnij OOM, błąd aplikacji i problem sondy.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/kubernetes/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Ustaw małe limity na Podzie labowym
2. Uruchom bezpieczny test
3. Zbierz describe previous logs i events
4. Uzasadnij zmianę

## Kryteria zaliczenia

- Diagnoza ma dowody
- Nie zwiększasz zasobów na ślepo
- Po naprawie Pod działa

## Weryfikacja

Sprawdź kubectl logs --previous events i status

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** OOMKilled różni się od exception aplikacji
2. **Kierunek:** Porównaj requests i limits
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Nie przeciążaj hosta
