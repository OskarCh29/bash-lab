---
id: "T-0049"
title: "Wykryj dryf GitOps"
module: "11-helm-gitops"
level: 4
duration_minutes: 30
requires: ["T-0048"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0049 — Wykryj dryf GitOps

> Moduł: Helm i GitOps — Argo CD · Poziom 4 · 30 min

## Misja

Ręczna zmiana zasobu różni się od deklaracji w Git. Wykryj dryf i przywróć stan.

## Cel nauki

Poznaj drift detection i synchronizację.

## Zadania

1. Zmień nieszkodliwą wartość własnego zasobu
2. Obserwuj różnicę
3. Przywróć stan synchronizacją
4. Zapisz jak uniknąć ręcznych zmian

## Kryteria zaliczenia

- Wskazujesz źródło prawdy
- Weryfikujesz stan po sync
- Oddzielasz wykrycie od naprawy

## Weryfikacja

Porównaj status Argo CD i kubectl po synchronizacji

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Git opisuje stan pożądany
2. **Kierunek:** Ćwicz wyłącznie na własnym obiekcie
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Potwierdź zgodność z Git
