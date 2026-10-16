---
id: "T-0012"
title: "Czy usługa naprawdę nasłuchuje?"
module: "02-linux"
level: 2
duration_minutes: 25
requires: ["T-0011"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0012 — Czy usługa naprawdę nasłuchuje?

> Moduł: Linux — pliki, procesy i sieć · Poziom 2 · 25 min

## Misja

Klient nie łączy się z lokalną usługą. Sprawdź proces, port, adres i protokół.

## Cel nauki

Poznaj podstawy diagnostyki TCP HTTP i curl.

## Zadania

1. Uruchom lokalny serwer testowy
2. Sprawdź porty nasłuchujące
3. Wykonaj curl i odczytaj status HTTP
4. Zapisz kolejność diagnozy

## Kryteria zaliczenia

- Rozróżniasz brak nasłuchu od błędu HTTP
- Wyjaśniasz wynik curl
- Nie wyłączasz zapory jako pierwszego kroku

## Weryfikacja

Porównaj aktywny i nieaktywny port

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Najpierw potwierdź działanie procesu
2. **Kierunek:** curl -v pokazuje szczegóły połączenia
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Zatrzymaj swój serwer testowy
