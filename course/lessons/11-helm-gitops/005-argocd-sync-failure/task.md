---
id: "T-0077"
title: "Napraw błąd synchronizacji Argo CD"
module: "11-helm-gitops"
level: 4
duration_minutes: 30
requires: ["T-0048"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0077 — Napraw błąd synchronizacji Argo CD

> Moduł: Helm i GitOps — Argo CD · Poziom 4 · 30 min

## Misja

Argo CD nie synchronizuje aplikacji. Ustal, czy problem jest w ścieżce, renderze czy stanie klastra.

## Cel nauki

Diagnozuj source path render i status aplikacji.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/kubernetes/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Wprowadź kontrolowany błąd ścieżki lub manifestu
2. Odczytaj status
3. Napraw błąd
4. Potwierdź sync i health

## Kryteria zaliczenia

- Wskazujesz konkretną przyczynę
- Nie omijasz walidacji
- Po naprawie aplikacja jest Synced i Healthy

## Weryfikacja

Sprawdź status Application i wyrenderowany manifest

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Rozróżnij błąd pobrania źródła od apply
2. **Kierunek:** Sprawdź path i render przed usunięciem app
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Pracuj na lokalnym release
