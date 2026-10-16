---
id: "T-0030"
title: "Skonteneryzuj aplikację Java"
module: "07-docker-compose"
level: 2
duration_minutes: 30
requires: ["T-0029"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0030 — Skonteneryzuj aplikację Java

> Moduł: Docker — od obrazu do aplikacji · Poziom 2 · 30 min

## Misja

QuestBoard ma działać bez lokalnego JDK i IDE. Przygotuj obraz z artefaktem i runtime.

## Cel nauki

Poznaj Dockerfile, kontekst buildu i porty.

## Zadania

1. Upewnij się, że Maven tworzy JAR
2. Zbuduj Dockerfile
3. Uruchom obraz i sprawdź logi
4. Wykonaj żądanie HTTP

## Kryteria zaliczenia

- Obraz buduje się od zera
- Nie trzeba montować źródeł
- Port i komenda są opisane

## Weryfikacja

Uruchom docker build i docker run, potem sprawdź endpoint

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Do runtime kopiuj potrzebne artefakty
2. **Kierunek:** Najpierw zapewnij działanie, potem optymalizuj
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Usuń tylko swój kontener i obraz
