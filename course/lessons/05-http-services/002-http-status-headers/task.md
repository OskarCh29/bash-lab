---
id: "T-0022"
title: "Metody HTTP, statusy i nagłówki"
module: "05-http-services"
level: 2
duration_minutes: 25
requires: ["T-0021"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0022 — Metody HTTP, statusy i nagłówki

> Moduł: HTTP — testowanie usług · Poziom 2 · 25 min

## Misja

Klient zgłasza błąd API. Sprawdź metodę, status i nagłówki zamiast wnioskować z samego body.

## Cel nauki

Ćwicz testowanie GET oraz interpretację statusów 2xx 4xx i 5xx.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Wyślij GET do health i zasobu profilu
2. Wyślij metodę inną niż GET do endpointu read-only
3. Porównaj status nagłówki i body
4. Wypełnij result.md

## Kryteria zaliczenia

- Rozróżniasz błąd klienta od serwera
- Wyniki opierają się na własnych żądaniach
- Nie interpretujesz body bez statusu

## Weryfikacja

Powtórz co najmniej dwa żądania

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Zapisz pełne żądanie i status
2. **Kierunek:** Nie wysyłaj niepotrzebnych danych w testach
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Zatrzymaj własny proces, jeśli go uruchomiłeś
