---
id: "T-0005"
title: "Czytaj status repozytorium"
module: "01-git"
level: 1
duration_minutes: 20
requires: ["T-0004"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0005 — Czytaj status repozytorium

> Moduł: Git — bezpieczna praca ze zmianami · Poziom 1 · 20 min

## Misja

Oceń, które pliki są zmienione, nowe lub ignorowane, zanim coś zatwierdzisz.

## Cel nauki

Zrozum working tree, staging area i historię commitów.

## Zadania

1. Uruchom git status --short
2. Zmień plik ćwiczeniowy
3. Porównaj git diff i git diff --staged

## Kryteria zaliczenia

- Wyjaśniasz różnicę pomiędzy diffami
- Nie dodajesz sekretów ani plików generowanych
- Wiesz, co jest w staging

## Weryfikacja

Zapisz git status przed i po operacji

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** git diff pokazuje zmiany poza staging
2. **Kierunek:** Commit obejmuje staging, nie automatycznie wszystkie pliki
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Nie używaj git reset --hard
