---
id: "T-0010"
title: "Uprawnienia bez chmod na ślepo"
module: "02-linux"
level: 2
duration_minutes: 25
requires: ["T-0009"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0010 — Uprawnienia bez chmod na ślepo

> Moduł: Linux — pliki, procesy i sieć · Poziom 2 · 25 min

## Misja

Skrypt nie uruchamia się. Ustal, czy problem dotyczy ścieżki, interpretera czy prawa wykonania.

## Cel nauki

Czytaj rwx i nadawaj minimalne potrzebne uprawnienia.

## Zadania

1. Utwórz hello.sh i uruchom przez interpreter
2. Spróbuj wykonać plik bezpośrednio
3. Sprawdź ls -l i popraw jedno uprawnienie
4. Wyjaśnij, czemu 777 to zły wybór

## Kryteria zaliczenia

- Skrypt działa bez pełnych praw dla wszystkich
- Rozumiesz rwx
- Nie zmieniasz praw poza labem

## Weryfikacja

Sprawdź ls -l i uruchom skrypt ponownie

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Porównaj bash hello.sh i ./hello.sh
2. **Kierunek:** Zwykle wystarczy dodać x właścicielowi
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Nie zmieniaj praw katalogów systemowych
