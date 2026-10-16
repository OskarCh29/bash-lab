---
id: "T-0032"
title: "Wolumeny i konfiguracja środowiskowa"
module: "07-docker-compose"
level: 3
duration_minutes: 30
requires: ["T-0031"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0032 — Wolumeny i konfiguracja środowiskowa

> Moduł: Docker — od obrazu do aplikacji · Poziom 3 · 30 min

## Misja

Dane znikają, a hasło trafia do konfiguracji. Rozdziel dane trwałe, ustawienia i sekrety.

## Cel nauki

Poznaj wolumeny oraz przekazywanie konfiguracji.

## Zadania

1. Dodaj wolumen PostgreSQL
2. Przenieś ustawienia do środowiska
3. Zignoruj lokalny plik sekretów
4. Sprawdź trwałość po odtworzeniu kontenera

## Kryteria zaliczenia

- Dane trwają, jeśli wolumen pozostaje
- Sekret nie trafia do Gita
- Konfiguracja jest opisana

## Weryfikacja

Odtwórz kontener bez kasowania wolumenu i odczytaj rekord

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Kontener i wolumen to oddzielne zasoby
2. **Kierunek:** .env lokalny nie powinien zawierać sekretów w repo
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Używaj fikcyjnych wartości
