---
id: "T-0046"
title: "Zapakuj manifesty w Helm chart"
module: "11-helm-gitops"
level: 3
duration_minutes: 30
requires: ["T-0045"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0046 — Zapakuj manifesty w Helm chart

> Moduł: Helm i GitOps — Argo CD · Poziom 3 · 30 min

## Misja

Kilka środowisk wymaga podobnych manifestów. Przenieś zmienne pola do chartu.

## Cel nauki

Poznaj templates values.yaml i renderowanie.

## Zadania

1. Utwórz chart
2. Przenieś konfigurowalne pola do values
3. Wyrenderuj manifesty
4. Wdróż lokalnie

## Kryteria zaliczenia

- Chart przechodzi lint
- YAML ma poprawne nazwy i porty
- Wartości domyślne działają

## Weryfikacja

Uruchom helm lint i helm template przed instalacją

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Renderuj przed wdrożeniem
2. **Kierunek:** Nie parametryzuj wszystkiego bez powodu
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Usuń własny release
