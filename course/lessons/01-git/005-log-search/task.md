---
id: "T-0053"
title: "Czytaj historię Git i filtruj logi"
module: "01-git"
level: 2
duration_minutes: 25
requires: ["T-0006"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0053 — Czytaj historię Git i filtruj logi

> Moduł: Git — bezpieczna praca ze zmianami · Poziom 2 · 25 min

## Misja

Znajdź commit, który wprowadził zmianę, bez otwierania wszystkich plików.

## Cel nauki

Ćwicz git log, --stat, -S i git show.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/git-taskboard/

## Zadania

1. Skopiuj fixture do sandboxa
2. Zrób kilka małych commitów
3. Znajdź commit zmieniający konkretny tekst
4. Obejrzyj patch

## Kryteria zaliczenia

- Wskazujesz commit i zmianę
- Rozróżniasz metadane od diffu
- Nie zmieniasz historii głównej gałęzi

## Weryfikacja

Użyj git log --oneline --graph oraz git show

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Zawęź historię nazwą pliku lub frazą
2. **Kierunek:** git log -S wyszukuje zmiany liczby wystąpień tekstu
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Pracuj na kopii fixture
