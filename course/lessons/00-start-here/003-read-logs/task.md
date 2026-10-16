---
id: "T-0003"
title: "Znajdź wskazówkę w logach"
module: "00-start-here"
level: 1
duration_minutes: 25
requires: ["T-0001"]
deliverable: "diagnoza-logów"
---

# T-0003 — Znajdź wskazówkę w logach

## Misja
task-api odpowiada na healthcheck, ale żądanie zależne zwraca 502. Ustal, co mówią logi, zanim zrestartujesz usługę.

## Cel nauki
Wyciągać dowody z logów i oddzielać fakt od hipotezy.

## Materiały
- [Materiały lekcji](materials/README.md)
- [Log aplikacji](../../../fixtures/linux/logs/app.log)
- [Log dostępu](../../../fixtures/linux/logs/access.log)
- Uzupełnij result.md.

## Zadania
1. Znajdź wpisy ERROR przez terminal.
2. Policz wystąpienia ERROR i statusy HTTP.
3. Znajdź najwcześniejszy wpis, który może wyjaśniać 502.
4. Zapisz, co jest faktem, co hipotezą i jaki test wykonać dalej.

## Kryteria zaliczenia
- Używasz co najmniej dwóch poleceń filtrujących.
- Podajesz wyniki z terminala.
- Nie uznajesz pierwszego błędu za pewną przyczynę.

## Weryfikacja
Powtórz raport na access.log i opisz, co wnosi drugi log.

## Podpowiedzi
1. **Mała wskazówka:** zacznij od grep -n ERROR.
2. **Kierunek:** ostatnia kolumna access.log zawiera status HTTP.
3. **Gdy utkniesz:** pokaż AI pipeline i wynik, poproś o wyjaśnienie.

## Raport po zadaniu
Zapisz fakty, hipotezę i następny eksperyment w prywatnym Obsidianie.

## Porządkowanie
Nie edytuj źródłowych logów fixture.
