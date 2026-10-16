---
id: "T-0069"
title: "Oddziel konfigurację od sekretów w CI"
module: "08-ci-cd"
level: 3
duration_minutes: 25
requires: ["T-0068"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0069 — Oddziel konfigurację od sekretów w CI

> Moduł: CI/CD — automatyczne sprawdzanie · Poziom 3 · 25 min

## Misja

Pipeline potrzebuje parametru, ale wartości poufne nie mogą trafić do repo ani logów.

## Cel nauki

Poznaj GitHub Actions variables secrets i minimalne uprawnienia.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/ci/

## Zadania

1. Wybierz, co jest variable a co secret
2. Użyj wyłącznie fikcyjnego sekretu w ustawieniach labu
3. Nie drukuj wartości
4. Sprawdź logi runu

## Kryteria zaliczenia

- Workflow nie ma jawnych sekretów
- Log nie ujawnia wartości
- Uprawnienia są ograniczone

## Weryfikacja

Przejrzyj YAML i logi runu

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Nie wypisuj sekretów przez echo
2. **Kierunek:** Maskowanie logu nie uzasadnia drukowania sekretu
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Użyj wyłącznie fikcyjnych danych
