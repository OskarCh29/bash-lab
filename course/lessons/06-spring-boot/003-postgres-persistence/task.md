---
id: "T-0027"
title: "Zapisz zadania w PostgreSQL"
module: "06-spring-boot"
level: 3
duration_minutes: 30
requires: ["T-0026"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0027 — Zapisz zadania w PostgreSQL

> Moduł: Spring Boot — API i dane · Poziom 3 · 30 min

## Misja

Dane znikają po restarcie. Dodaj trwałość i sprawdź, czy zapis przetrwa.

## Cel nauki

Poznaj konfigurację bazy i persystencję.

## Zadania

1. Dodaj PostgreSQL do środowiska
2. Konfiguruj przez zmienne środowiskowe
3. Zaimplementuj zapis i odczyt
4. Restartuj aplikację i sprawdź dane

## Kryteria zaliczenia

- Konfigurację można zmienić bez kodu
- Sekret nie trafia do repo
- Rekord przetrwa restart procesu

## Weryfikacja

Zapisz rekord, zrestartuj aplikację i odczytaj go

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Oddziel konfigurację od kodu
2. **Kierunek:** Trwałość zależy od przechowywania danych, nie samego kontenera
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Używaj fikcyjnych haseł
