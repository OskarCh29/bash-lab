---
id: "T-0028"
title: "Test integracyjny i health endpoint"
module: "06-spring-boot"
level: 3
duration_minutes: 30
requires: ["T-0027"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0028 — Test integracyjny i health endpoint

> Moduł: Spring Boot — API i dane · Poziom 3 · 30 min

## Misja

Zespół potrzebuje dowodu, że aplikacja działa i udostępnia kontrolę zdrowia.

## Cel nauki

Odróżnij test integracyjny od jednostkowego i health od readiness.

## Zadania

1. Dodaj Actuator i potrzebne endpointy
2. Napisz test HTTP
3. Ogranicz ekspozycję endpointów zarządczych
4. Wyjaśnij liveness readiness health

## Kryteria zaliczenia

- Health działa zgodnie z oczekiwaniem
- Test obejmuje HTTP
- Nie wystawiasz zbędnych danych

## Weryfikacja

Uruchom mvn verify i odczytaj health

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Test integracyjny sprawdza granicę komponentów
2. **Kierunek:** Udostępniaj tylko potrzebne endpointy
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Sprawdź zbędną ekspozycję
