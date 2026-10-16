---
id: "T-0044"
title: "ConfigMap Secret i sondy"
module: "10-kubernetes"
level: 3
duration_minutes: 30
requires: ["T-0043"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0044 — ConfigMap Secret i sondy

> Moduł: Kubernetes — wdrożenie i diagnoza · Poziom 3 · 30 min

## Misja

Przenieś konfigurację poza obraz i dodaj sondy zdrowia.

## Cel nauki

Poznaj ConfigMap Secret liveness i readiness.

## Zadania

1. Przenieś niesekretną konfigurację
2. Użyj fikcyjnej wartości Secret
3. Dodaj sondy
4. Zasymuluj opóźniony start

## Kryteria zaliczenia

- Konfiguracja nie wymaga rebuilda
- Nie commitujesz sekretów
- Sondy mają rozdzielone role

## Weryfikacja

Sprawdź kubectl describe pod i events

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Readiness decyduje o ruchu
2. **Kierunek:** Secret nie oznacza automatycznie szyfrowania wszędzie
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Usuń tylko testowe zasoby
