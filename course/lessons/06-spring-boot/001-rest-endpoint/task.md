---
id: "T-0025"
title: "Pierwszy endpoint REST"
module: "06-spring-boot"
level: 2
duration_minutes: 30
requires: ["T-0024"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0025 — Pierwszy endpoint REST

> Moduł: Spring Boot — API i dane · Poziom 2 · 30 min

## Misja

QuestBoard potrzebuje GET endpointu zwracającego listę przykładowych zadań.

## Cel nauki

Poznaj kontroler HTTP, mapowanie i JSON.

## Zadania

1. Utwórz projekt Spring Boot z web starterem
2. Dodaj kontroler i przykładowe dane
3. Uruchom i sprawdź curl -i
4. Zapisz status i kształt JSON

## Kryteria zaliczenia

- Aplikacja startuje przez Maven
- Endpoint zwraca 2xx i JSON
- Port jest widoczny w logach

## Weryfikacja

Wykonaj curl -i do lokalnego endpointu

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Oddziel model danych od kontrolera
2. **Kierunek:** Sprawdź port w logu startowym
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Zatrzymaj aplikację po teście
