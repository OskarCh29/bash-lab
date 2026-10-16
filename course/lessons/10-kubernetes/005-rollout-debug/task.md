---
id: "T-0045"
title: "Limity i nieudany rollout"
module: "10-kubernetes"
level: 4
duration_minutes: 30
requires: ["T-0044"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0045 — Limity i nieudany rollout

> Moduł: Kubernetes — wdrożenie i diagnoza · Poziom 4 · 30 min

## Misja

Nowa wersja nie osiąga gotowości. Odczytaj events logi i historię przed rollbackiem.

## Cel nauki

Diagnozuj błędy obrazu startu i sond.

## Zadania

1. Dodaj requests i limits
2. Wprowadź kontrolowany błąd
3. Zbierz describe logs events i historię
4. Przywróć działający stan

## Kryteria zaliczenia

- Diagnoza ma dowody
- Rollback jest świadomy
- Aplikacja odpowiada po naprawie

## Weryfikacja

Sprawdź rollout status i endpoint po naprawie

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Różne statusy Podów mają różne przyczyny
2. **Kierunek:** Porównaj z poprzednią działającą wersją
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Przywróć stabilny manifest
