---
id: "T-0078"
title: "Wykryj dryf i przygotuj rollback przez Git"
module: "11-helm-gitops"
level: 4
duration_minutes: 30
requires: ["T-0077"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0078 — Wykryj dryf i przygotuj rollback przez Git

> Moduł: Helm i GitOps — Argo CD · Poziom 4 · 30 min

## Misja

Zmiana konfiguracji psuje aplikację po sync. Przywróć stan przez wersjonowaną zmianę.

## Cel nauki

Ćwicz zmianę przez Git i weryfikację rollbacku.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/kubernetes/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Zrób commit zmiany wartości
2. Obserwuj sync i health
3. Przygotuj commit odwracający lub revert
4. Potwierdź stan klastra

## Kryteria zaliczenia

- Rollback ma ślad w historii
- Stan klastra jest sprawdzony
- Nie naprawiasz driftu ręcznym patchem

## Weryfikacja

Sprawdź git log diff i status Argo CD

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Git opisuje stan pożądany
2. **Kierunek:** Nie używaj force push do odwracania release
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Pracuj w lokalnym klastrze i potwierdź stabilny stan
