---
id: "T-0063"
title: "Zrób bezpieczną kopię katalogu"
module: "03-bash"
level: 3
duration_minutes: 30
requires: ["T-0062"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0063 — Zrób bezpieczną kopię katalogu

> Moduł: Bash — automatyzacja · Poziom 3 · 30 min

## Misja

Przygotuj powtarzalny backup, który nie nadpisze istniejących danych po cichu.

## Cel nauki

Ćwicz walidację wejścia tar i obsługę błędów.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/bash/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Backupuj katalog fixture
2. Odmów nieistniejącej ścieżki
3. Zapisz archiwum w osobnym katalogu
4. Zweryfikuj listę plików

## Kryteria zaliczenia

- Backup zawiera oczekiwane pliki
- Re-run nie nadpisuje bez ostrzeżenia
- Błąd nie raportuje sukcesu

## Weryfikacja

Sprawdź tar -tzf i porównaj liczbę plików

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Waliduj wejście przed utworzeniem archiwum
2. **Kierunek:** Nie używaj rm -rf bez sprawdzenia ścieżki
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Nie korzystaj z prawdziwych danych
