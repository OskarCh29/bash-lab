---
id: "T-0073"
title: "Ćwicz namespace i context"
module: "10-kubernetes"
level: 2
duration_minutes: 20
requires: ["T-0039"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0073 — Ćwicz namespace i context

> Moduł: Kubernetes — wdrożenie i diagnoza · Poziom 2 · 20 min

## Misja

Nie zakładaj, że kubectl kieruje polecenie do właściwego klastra i namespace.

## Cel nauki

Poznaj context namespace i jawne cele komend.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/kubernetes/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Sprawdź current context
2. Utwórz namespace labowy
3. Wdróż nieszkodliwy obiekt
4. Porównaj get z flagą -n

## Kryteria zaliczenia

- Wiesz, dokąd trafia komenda
- Nie zmieniasz zasobów systemowych
- Potrafisz posprzątać lab

## Weryfikacja

Użyj current-context i get all w namespace labowym

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Przed apply/delete sprawdź context
2. **Kierunek:** Jawny namespace zmniejsza ryzyko
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Usuwaj namespace tylko po kontroli zawartości
