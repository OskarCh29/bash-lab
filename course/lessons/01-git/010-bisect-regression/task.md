---
id: "T-0058"
title: "Znajdź commit wprowadzający regresję"
module: "01-git"
level: 4
duration_minutes: 30
requires: ["T-0057"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0058 — Znajdź commit wprowadzający regresję

> Moduł: Git — bezpieczna praca ze zmianami · Poziom 4 · 30 min

## Misja

Program działał, a potem przestał. Znajdź commit wprowadzający problem.

## Cel nauki

Ćwicz git bisect jako kontrolowany eksperyment.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/git-taskboard/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Przygotuj kilka commitów i znany błąd na kopii
2. Zdefiniuj test good/bad
3. Wykonaj bisect
4. Zapisz znaleziony commit

## Kryteria zaliczenia

- Wynik wskazuje konkretny commit
- Test jest powtarzalny
- Umiesz zakończyć bisect

## Weryfikacja

Sprawdź commit przez git show i zakończ bisect

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Bisect wymaga wiarygodnego testu
2. **Kierunek:** Nie oceniaj commita na podstawie wrażenia
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Pracuj bez niezatwierdzonych zmian
