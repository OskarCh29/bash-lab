---
id: "T-0024"
title: "Klient i serwer — rozpoznaj warstwę błędu"
module: "05-http-services"
level: 3
duration_minutes: 30
requires: ["T-0023"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0024 — Klient i serwer — rozpoznaj warstwę błędu

> Moduł: HTTP — testowanie usług · Poziom 3 · 30 min

## Misja

Symptom „nie działa” może oznaczać DNS TCP HTTP albo wadliwą treść. Zbuduj drzewo diagnozy.

## Cel nauki

Ustalaj warstwę problemu na podstawie dowodów.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Zbierz przykłady: zły host nieaktywny port 404 i działający health
2. Wykonaj curl i zapisz wynik
3. Przypisz błąd do DNS połączenia HTTP lub payloadu
4. Przygotuj drzewo decyzyjne

## Kryteria zaliczenia

- Drzewo zaczyna się od tanich testów
- Nie mylisz timeoutu z kodem HTTP
- Procedura jest powtarzalna

## Weryfikacja

Poproś inną osobę o wybór scenariusza i sklasyfikuj go

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Każda warstwa daje inne dowody
2. **Kierunek:** Nie diagnozuj JSON, jeśli połączenie nie działa
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Nie zmieniaj systemowego DNS ani zapory
