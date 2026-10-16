---
id: "T-0042"
title: "Wdróż aplikację jako Deployment"
module: "10-kubernetes"
level: 2
duration_minutes: 30
requires: ["T-0041"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0042 — Wdróż aplikację jako Deployment

> Moduł: Kubernetes — wdrożenie i diagnoza · Poziom 2 · 30 min

## Misja

Uruchom kontener deklaratywnie, tak by Kubernetes odtworzył usunięty Pod.

## Cel nauki

Poznaj Pod Deployment replicas i manifesty.

## Zadania

1. Przygotuj obraz dla Minikube
2. Zdefiniuj Deployment
3. Zastosuj manifest i obserwuj rollout
4. Usuń Pod i sprawdź odtworzenie

## Kryteria zaliczenia

- Deployment osiąga gotowość
- Wyjaśniasz odtworzenie Poda
- Manifest jest wersjonowany

## Weryfikacja

Użyj kubectl apply get deploy,pods i rollout status

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Sprawdź dostępność obrazu w Minikube
2. **Kierunek:** Deployment zarządza replikami
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Usuwaj tylko zasoby questu
