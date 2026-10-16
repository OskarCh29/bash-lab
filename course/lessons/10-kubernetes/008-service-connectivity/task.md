---
id: "T-0075"
title: "Sprawdź Service i selektory"
module: "10-kubernetes"
level: 3
duration_minutes: 25
requires: ["T-0074"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0075 — Sprawdź Service i selektory

> Moduł: Kubernetes — wdrożenie i diagnoza · Poziom 3 · 25 min

## Misja

Pody są Running, lecz Service nie ma endpointów. Znajdź rozbieżność label/selector lub portów.

## Cel nauki

Ćwicz service discovery i diagnozę endpointów.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/kubernetes/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Sprawdź labels i selector
2. Odczytaj endpoints
3. Wprowadź błąd selektora
4. Napraw i przetestuj połączenie

## Kryteria zaliczenia

- Wiesz, dlaczego endpointów brakowało
- Poprawka jest minimalna
- Żądanie działa po naprawie

## Weryfikacja

Sprawdź get svc,endpoints i describe svc

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Service wybiera pody przez selector
2. **Kierunek:** Port Service i targetPort są różne
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Pracuj w namespace labowym
