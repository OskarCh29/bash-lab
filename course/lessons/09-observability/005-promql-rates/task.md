---
id: "T-0071"
title: "Zbuduj query PromQL dla ruchu"
module: "09-observability"
level: 3
duration_minutes: 25
requires: ["T-0037"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0071 — Zbuduj query PromQL dla ruchu

> Moduł: Observability — Prometheus i Grafana · Poziom 3 · 25 min

## Misja

Dashboard pokazuje liczniki surowe, ale potrzebujesz tempa żądań i błędów.

## Cel nauki

Poznaj counter rate i podstawowe agregacje.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/observability/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Wygeneruj kilka żądań
2. Znajdź realne nazwy metryk
3. Zbuduj query rate
4. Opisz ograniczenia próby w result.md

## Kryteria zaliczenia

- Query bazuje na istniejących metrykach
- Okno czasu jest jawne
- Wniosek nie przesadza

## Weryfikacja

Porównaj wartość przed i po ruchu

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Counter analizuj jako zmianę w czasie
2. **Kierunek:** Nie zakładaj nazwy metryki
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Używaj lokalnych metryk
