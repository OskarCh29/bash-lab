---
id: "T-0018"
title: "Uruchom usługę Java z terminala"
module: "04-app-fixtures"
level: 1
duration_minutes: 25
requires: ["T-0017"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0018 — Uruchom usługę Java z terminala

> Moduł: Aplikacje przykładowe — Java jako materiał · Poziom 1 · 25 min

## Misja

Aplikacja działa w IDE, ale środowisko serwerowe nie ma IDE. Uruchom ją poleceniami terminala.

## Cel nauki

Ćwicz uruchomienie gotowej aplikacji i obserwację procesu.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Skopiuj źródło do własnego katalogu
2. Skompiluj zgodnie z README fixture
3. Uruchom usługę i wykonaj curl do health
4. Zatrzymaj proces i potwierdź, że port nie odpowiada

## Kryteria zaliczenia

- Usługa działa poza IDE
- Potrafisz znaleźć log startowy i port
- Zatrzymujesz wyłącznie swój proces

## Weryfikacja

Użyj java -version, javac według README i curl -i

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Fixture używa modułu JDK jdk.httpserver
2. **Kierunek:** Katalog kompilacji trzymaj poza wspólnym źródłem
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Zatrzymaj proces i usuń własny katalog builda
