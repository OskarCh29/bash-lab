---
id: "T-0059"
title: "Inspekcja plików ukrytych i metadanych"
module: "02-linux"
level: 1
duration_minutes: 20
requires: ["T-0012"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0059 — Inspekcja plików ukrytych i metadanych

> Moduł: Linux — pliki, procesy i sieć · Poziom 1 · 20 min

## Misja

Raport nie może zakładać, że widoczne pliki są całą zawartością katalogu.

## Cel nauki

Pozyskaj rozmiary typy uprawnienia i ścieżki przez terminal.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/terminal/ and course/fixtures/linux/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Znajdź plik .hidden-ops-note.txt
2. Użyj stat file i wc
3. Uzupełnij result.md

## Kryteria zaliczenia

- Wypełniasz rzeczywiste wyniki
- Rozróżniasz bajty i linie
- Nie zgadujesz na podstawie edytora

## Weryfikacja

Powtórz pomiar przez stat i wc -c

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** ls -la pokazuje ukryte pliki
2. **Kierunek:** Rozmiar logiczny i liczba linii to różne miary
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Nie edytuj wspólnego fixture
