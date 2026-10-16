---
id: "T-0034"
title: "Pipeline build i test"
module: "08-ci-cd"
level: 2
duration_minutes: 25
requires: ["T-0033"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0034 — Pipeline build i test

> Moduł: CI/CD — automatyczne sprawdzanie · Poziom 2 · 25 min

## Misja

Każda zmiana ma przejść build i testy bez ręcznej pracy autora.

## Cel nauki

Poznaj workflow, joby i zdarzenia GitHub Actions.

## Zadania

1. Dodaj workflow dla push i pull_request
2. Skonfiguruj JDK i mvn verify
3. Sprawdź logi runu
4. Przetestuj kontrolowanie nieudany test

## Kryteria zaliczenia

- Workflow reaguje na właściwe zdarzenia
- Błędny test blokuje pipeline
- Nie commitujesz sekretów

## Weryfikacja

Potwierdź zielony i czerwony run

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Zacznij od jednego joba
2. **Kierunek:** CI ma ujawniać błędy
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Usuń kontrolowaną błędną zmianę
