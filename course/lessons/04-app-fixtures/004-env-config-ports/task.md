---
id: "T-0020"
title: "Konfiguracja portu przez zmienną środowiskową"
module: "04-app-fixtures"
level: 2
duration_minutes: 25
requires: ["T-0019"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0020 — Konfiguracja portu przez zmienną środowiskową

> Moduł: Aplikacje przykładowe — Java jako materiał · Poziom 2 · 25 min

## Misja

Ten sam artefakt ma działać na różnych portach bez zmiany kodu.

## Cel nauki

Rozumiej zmienne runtime i unikaj wbudowywania konfiguracji w obraz.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Uruchom usługę na porcie domyślnym
2. Uruchom ją ponownie z alternatywną wartością PORT
3. Sprawdź nowy i stary port
4. Zapisz komendy i wyniki w result.md

## Kryteria zaliczenia

- Ten sam kod działa na dwóch portach
- Umiesz wskazać ustawienie przekazane procesowi
- Nie commitujesz sekretów

## Weryfikacja

Porównaj odpowiedzi health na obu portach

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Zmienna ustawiona przed komendą ma zakres uruchamianego procesu
2. **Kierunek:** Zatrzymaj poprzednią instancję, aby uniknąć konfliktu portów
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Zatrzymaj procesy testowe; nie zmieniaj konfiguracji systemowej
