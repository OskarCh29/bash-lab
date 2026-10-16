---
id: "T-0047"
title: "Wartości dla dwóch środowisk"
module: "11-helm-gitops"
level: 3
duration_minutes: 25
requires: ["T-0046"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0047 — Wartości dla dwóch środowisk

> Moduł: Helm i GitOps — Argo CD · Poziom 3 · 25 min

## Misja

Dev i test używają tego samego chartu z innymi replikami i ustawieniami.

## Cel nauki

Projektuj nadpisania bez duplikowania manifestów.

## Zadania

1. Zdefiniuj wartości domyślne i dev/test
2. Oddziel konfigurację od sekretów
3. Wyrenderuj oba warianty i porównaj

## Kryteria zaliczenia

- Oba środowiska używają jednego chartu
- Różnice są jawne
- Brak prawdziwych sekretów

## Weryfikacja

Użyj helm template dla obu wariantów

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Zachowaj wspólne wartości bazowe
2. **Kierunek:** Sekrety dostarczaj osobnym mechanizmem
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Nie zapisuj haseł ani kluczy
