---
id: "T-0055"
title: "Restore, reset i revert — różne narzędzia"
module: "01-git"
level: 3
duration_minutes: 30
requires: ["T-0054"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0055 — Restore, reset i revert — różne narzędzia

> Moduł: Git — bezpieczna praca ze zmianami · Poziom 3 · 30 min

## Misja

Wycofaj pomyłkę bez niszczenia poprawnej historii.

## Cel nauki

Rozróżniaj zmiany robocze, staging i commit opublikowany.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/git-taskboard/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Wykonaj zmianę unstaged i staged
2. Sprawdź git restore na kopii
3. Utwórz commit testowy i użyj git revert
4. Opisz, czego nie należy robić na współdzielonej gałęzi

## Kryteria zaliczenia

- Wiesz, co każda operacja zmienia
- Sprawdzasz diff przed zmianą destrukcyjną
- Nie używasz reset --hard jako domyślnej naprawy

## Weryfikacja

Sprawdź status diff i log przed oraz po

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Niezacommitowana zmiana i commit to różne przypadki
2. **Kierunek:** revert dodaje commit odwracający zmianę
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Nie eksperymentuj na jedynej kopii pracy
