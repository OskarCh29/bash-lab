---
id: "T-0064"
title: "Napisz CLI healthcheck usługi"
module: "03-bash"
level: 3
duration_minutes: 25
requires: ["T-0063"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0064 — Napisz CLI healthcheck usługi

> Moduł: Bash — automatyzacja · Poziom 3 · 25 min

## Misja

Operator potrzebuje komendy rozpoznającej, czy lokalne API odpowiada.

## Cel nauki

Ćwicz curl timeout i kody wyjścia.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/bash/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Napisz skrypt sprawdzający URL
2. Ustaw krótki timeout
3. Raportuj status
4. Zwróć niezerowy kod dla błędu

## Kryteria zaliczenia

- Skrypt kończy się szybko przy awarii
- Sukces i błąd mają różne kody
- Nie ujawniasz danych

## Weryfikacja

Testuj przy działającym i zatrzymanym API

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Użyj curl --max-time
2. **Kierunek:** Kod curl nie zawsze oznacza HTTP 2xx
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Testuj lokalnie
