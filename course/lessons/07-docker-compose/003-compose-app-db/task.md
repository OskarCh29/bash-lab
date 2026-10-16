---
id: "T-0031"
title: "Połącz aplikację i bazę przez Compose"
module: "07-docker-compose"
level: 3
duration_minutes: 30
requires: ["T-0030"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0031 — Połącz aplikację i bazę przez Compose

> Moduł: Docker — od obrazu do aplikacji · Poziom 3 · 30 min

## Misja

Uruchom API i PostgreSQL jedną komendą bez ręcznego wpisywania IP kontenerów.

## Cel nauki

Poznaj usługi Compose, sieć i konfigurację połączeń.

## Zadania

1. Dodaj usługi do compose.yaml
2. Użyj nazwy usługi bazy jako hosta
3. Uruchom zestaw i sprawdź logi
4. Sprawdź zachowanie danych po restarcie

## Kryteria zaliczenia

- Zestaw startuje jedną komendą
- API łączy się przez sieć Compose
- Nie wyszukujesz IP ręcznie

## Weryfikacja

Uruchom docker compose up --build i wykonaj żądanie

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** localhost w kontenerze wskazuje ten kontener
2. **Kierunek:** Nazwa usługi jest hostname w Compose
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Przed down -v sprawdź, czy nie kasujesz danych
