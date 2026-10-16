---
id: "T-0023"
title: "JSON, błędne adresy i timeouty"
module: "05-http-services"
level: 2
duration_minutes: 25
requires: ["T-0022"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0023 — JSON, błędne adresy i timeouty

> Moduł: HTTP — testowanie usług · Poziom 2 · 25 min

## Misja

Nie każdy problem to błąd HTTP. Rozpoznaj nieistniejącą ścieżkę, niedostępny port i timeout.

## Cel nauki

Odróżniaj odpowiedź HTTP od błędu połączenia i timeoutu.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Wywołaj istniejący endpoint
2. Wywołaj nieistniejącą ścieżkę
3. Wywołaj nieaktywny port z krótkim timeoutem
4. Opisz wyniki w result.md

## Kryteria zaliczenia

- Rozróżniasz 4xx odmowę połączenia i timeout
- Każdy wniosek ma dowód
- Nie wydłużasz timeoutu bez diagnozy

## Weryfikacja

Porównaj działający endpoint 404 i port bez nasłuchu

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Błąd transportu nie ma statusu HTTP, jeśli odpowiedź nie nadeszła
2. **Kierunek:** Opcje timeout curl ograniczają czas testu
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Używaj tylko lokalnych adresów
