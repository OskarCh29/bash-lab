---
id: "T-0025"
title: "Uruchom dwie niezależne usługi REST"
module: "06-service-integration"
level: 2
duration_minutes: 30
requires: ["T-0024"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0025 — Uruchom dwie niezależne usługi REST

> Moduł: Integracja dwóch usług REST · Poziom 2 · 30 min

## Misja

Uruchom task-api i profile-api na różnych portach oraz sprawdź każdą usługę niezależnie.

## Cel nauki

Przygotuj działający punkt odniesienia przed konteneryzacją.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Skompiluj obie usługi do osobnych katalogów
2. Uruchom profile-api na 8081 i task-api na 8080
3. Sprawdź health i endpointy
4. Zapisz PID port i wyniki

## Kryteria zaliczenia

- Obie usługi odpowiadają niezależnie
- Nie ma konfliktu portów
- Każdą można zatrzymać oddzielnie

## Weryfikacja

Zatrzymaj jedną usługę i potwierdź, że druga nadal działa

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Obie fixture używają modułu JDK jdk.httpserver
2. **Kierunek:** Zwróć uwagę na PORT
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Zatrzymaj własne procesy i usuń buildy
