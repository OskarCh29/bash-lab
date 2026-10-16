---
id: "T-0061"
title: "Spakuj logi i sprawdź sumę"
module: "02-linux"
level: 2
duration_minutes: 25
requires: ["T-0060"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0061 — Spakuj logi i sprawdź sumę

> Moduł: Linux — pliki, procesy i sieć · Poziom 2 · 25 min

## Misja

Przygotuj paczkę diagnostyczną, którą odbiorca może zweryfikować.

## Cel nauki

Poznaj tar gzip i SHA-256.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/terminal/ and course/fixtures/linux/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Spakuj kopię fixture logów
2. Oblicz sha256sum
3. Rozpakuj do nowego katalogu
4. Porównaj zawartość

## Kryteria zaliczenia

- Oryginały pozostały bez zmian
- Paczka się rozpakowuje
- Wyjaśniasz, co potwierdza checksum

## Weryfikacja

Użyj tar -tzf i sha256sum

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Sprawdź listę archiwum przed rozpakowaniem
2. **Kierunek:** Suma wykrywa zmianę bajtów, ale nie dowodzi pochodzenia
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Pracuj w katalogu tymczasowym
