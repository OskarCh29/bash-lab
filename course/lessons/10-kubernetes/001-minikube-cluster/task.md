---
id: "T-0041"
title: "Uruchom lokalny klaster"
module: "10-kubernetes"
level: 2
duration_minutes: 25
requires: ["T-0040"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0041 — Uruchom lokalny klaster

> Moduł: Kubernetes — wdrożenie i diagnoza · Poziom 2 · 25 min

## Misja

Przygotuj Minikube i ustal, z jakim klastrem rozmawia kubectl.

## Cel nauki

Poznaj cluster node context i namespace.

## Zadania

1. Sprawdź wymagania
2. Uruchom klaster
3. Sprawdź current-context nody i namespace
4. Zapisz komendy statusu

## Kryteria zaliczenia

- Klaster jest gotowy
- Sprawdzasz kontekst
- Wiesz, że kubectl może wskazywać różne klastry

## Weryfikacja

Uruchom kubectl get nodes i minikube status

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Context wskazuje klaster i namespace
2. **Kierunek:** Sprawdź zasoby przed zmianą YAML
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Nie usuwaj innych kontekstów
