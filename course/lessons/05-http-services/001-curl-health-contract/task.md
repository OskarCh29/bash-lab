---
id: "T-0021"
title: "Sprawdź kontrakt HTTP przez curl"
module: "05-http-services"
level: 1
duration_minutes: 20
requires: ["T-0020"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0021 — Sprawdź kontrakt HTTP przez curl

> Moduł: HTTP — testowanie usług · Poziom 1 · 20 min

## Misja

Ustal dostępność usługi, status HTTP, nagłówki i treść odpowiedzi bez przeglądarki.

## Cel nauki

Używaj curl do weryfikacji usług i zapisuj dowody operacyjne.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Uruchom profile-api
2. Wykonaj curl -i do health i /api/profiles/1
3. Zapisz status Content-Type i pola JSON
4. Sprawdź nieistniejącą ścieżkę

## Kryteria zaliczenia

- Wskazujesz status i Content-Type
- Rozróżniasz transport od odpowiedzi HTTP
- Wyniki pochodzą z własnych komend

## Weryfikacja

Powtórz test i porównaj statusy

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Opcja -i pokazuje nagłówki odpowiedzi
2. **Kierunek:** Status HTTP i kod wyjścia curl to dwa różne sygnały
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Zatrzymaj swój proces testowy
