---
id: "T-0028"
title: "Narysuj ścieżkę żądania"
module: "06-service-integration"
level: 3
duration_minutes: 25
requires: ["T-0027"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0028 — Narysuj ścieżkę żądania

> Moduł: Integracja dwóch usług REST · Poziom 3 · 25 min

## Misja

Jedno żądanie klienta przechodzi przez task-api i profile-api. Udokumentuj granice porty i miejsca awarii.

## Cel nauki

Myśl o systemie jako o przepływie między procesami.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Wywołaj endpoint zależny
2. Ustal kolejność wywołań z kodu i logów
3. Narysuj klient task-api profile-api
4. Przypisz porty i typy awarii w result.md

## Kryteria zaliczenia

- Diagram ma kierunek zależności
- Porty pochodzą z konfiguracji
- Rozróżniasz co najmniej trzy punkty awarii

## Weryfikacja

Użyj diagramu do przewidzenia skutków zatrzymania każdej usługi

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** task-api jest klientem HTTP dla profile-api
2. **Kierunek:** Ruch klient-host i kontener-kontener to różne ścieżki
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Nie dotyczy
