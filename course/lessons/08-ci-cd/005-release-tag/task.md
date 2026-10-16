---
id: "T-0070"
title: "Zbuduj powtarzalny release z tagu"
module: "08-ci-cd"
level: 3
duration_minutes: 30
requires: ["T-0069"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0070 — Zbuduj powtarzalny release z tagu

> Moduł: CI/CD — automatyczne sprawdzanie · Poziom 3 · 30 min

## Misja

Odróżnij zwykły build od wydania oznaczonego wersją i zachowaj artefakt powiązany z commitem.

## Cel nauki

Poznaj trigger tagowy i nazewnictwo artefaktów.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/ci/

## Zadania

1. Dodaj trigger dla tagu wersji
2. Uruchom build
3. Opublikuj artefakt z wersją w nazwie
4. Opisz, jak znaleźć commit źródłowy

## Kryteria zaliczenia

- Release ma tag i commit
- Artefakt można pobrać
- Workflow ma minimalne uprawnienia

## Weryfikacja

Sprawdź Actions i tag commit

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Tag i branch to różne referencje
2. **Kierunek:** Nie publikuj sekretów jako artefaktów
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Wykonuj w repo labowym
