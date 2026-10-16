---
id: "T-0019"
title: "Proces Java, logi i port"
module: "04-app-fixtures"
level: 2
duration_minutes: 25
requires: ["T-0018"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0019 — Proces Java, logi i port

> Moduł: Aplikacje przykładowe — Java jako materiał · Poziom 2 · 25 min

## Misja

Usługa nie odpowiada. Zbadaj proces i port przed restartem.

## Cel nauki

Łącz inspekcję procesu, portu, logów i żądania HTTP.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Uruchom fixture i zapisz PID oraz log startowy
2. Sprawdź port nasłuchujący
3. Wykonaj żądanie do health, zatrzymaj proces i ponów test
4. Uzupełnij result.md faktami

## Kryteria zaliczenia

- Wskazujesz dowód, czy proces działa
- Rozróżniasz błąd połączenia od HTTP
- Nie kończysz cudzych procesów

## Weryfikacja

Powtórz diagnozę dla usługi działającej i zatrzymanej

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Sprawdź proces i port, zanim analizujesz HTTP
2. **Kierunek:** Zapisz komendę i rzeczywisty wynik
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Zatrzymaj tylko własny proces
