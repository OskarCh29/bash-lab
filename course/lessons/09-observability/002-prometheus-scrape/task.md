---
id: "T-0038"
title: "Skonfiguruj Prometheusa"
module: "09-observability"
level: 3
duration_minutes: 30
requires: ["T-0037"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0038 — Skonfiguruj Prometheusa

> Moduł: Observability — Prometheus i Grafana · Poziom 3 · 30 min

## Misja

Prometheus nie zbiera danych z API. Znajdź adres osiągalny z perspektywy kontenera.

## Cel nauki

Poznaj scrape config, status targetu i sieć Compose.

## Zadania

1. Dodaj job i endpoint metryk
2. Sprawdź targety
3. Wprowadź błąd portu w labie
4. Napraw go

## Kryteria zaliczenia

- Target jest UP
- Rozumiesz różnicę localhost hosta i kontenera
- Diagnoza opiera się na statusie

## Weryfikacja

Sprawdź Targets i wykonaj query PromQL

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Nazwa usługi Compose działa w sieci
2. **Kierunek:** Adres hosta i kontenera mogą się różnić
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Zachowaj lokalną konfigurację
