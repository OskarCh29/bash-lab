---
id: "T-0056"
title: "Przenieś pojedynczy commit przez cherry-pick"
module: "01-git"
level: 3
duration_minutes: 25
requires: ["T-0055"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0056 — Przenieś pojedynczy commit przez cherry-pick

> Moduł: Git — bezpieczna praca ze zmianami · Poziom 3 · 25 min

## Misja

Poprawka jest na innym branchu, ale potrzebujesz jej bez łączenia całej gałęzi.

## Cel nauki

Ćwicz identyfikowanie i selektywne przenoszenie commitów.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/git-taskboard/

## Zadania

1. Utwórz branch poprawki i commit
2. Przełącz się do drugiej gałęzi
3. Znajdź SHA i wykonaj cherry-pick
4. Porównaj historię

## Kryteria zaliczenia

- Przenosisz właściwy commit
- Rozumiesz nowy SHA
- Nie przenosisz obcych commitów

## Weryfikacja

Użyj git show i git log --graph

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Cherry-pick przenosi zmianę wybranego commita
2. **Kierunek:** Sprawdź zależności poprawki
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Ćwicz w kopii fixture
