---
id: "T-0020"
title: "Wyjątki i model błędu"
module: "04-java"
level: 2
duration_minutes: 25
requires: ["T-0019"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0020 — Wyjątki i model błędu

> Moduł: Java — fundamenty języka · Poziom 2 · 25 min

## Misja

Parser otrzymuje pusty ciąg, zły format albo wartość poza zakresem. Zaprojektuj przewidywalne zachowanie.

## Cel nauki

Rozróżniaj walidację biznesową i wyjątki.

## Zadania

1. Napisz parser
2. Ustal przypadki błędu walidacji i wyjątku
3. Obsłuż błędy tam, gdzie można podjąć decyzję
4. Dodaj czytelny komunikat

## Kryteria zaliczenia

- Błędy nie są ignorowane
- Wyjątki nie zastępują każdej gałęzi
- Puste wejście jest obsłużone

## Weryfikacja

Przetestuj wartość dobrą, pustą, zły format i zakres

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Oddziel błąd danych od technicznego
2. **Kierunek:** Nie łap Exception tylko po to, by ukryć problem
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Zachowaj przypadki błędów
