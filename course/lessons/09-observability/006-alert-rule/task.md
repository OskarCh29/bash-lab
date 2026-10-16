---
id: "T-0072"
title: "Dodaj alert dla niedostępnej usługi"
module: "09-observability"
level: 4
duration_minutes: 30
requires: ["T-0071"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0072 — Dodaj alert dla niedostępnej usługi

> Moduł: Observability — Prometheus i Grafana · Poziom 4 · 30 min

## Misja

Operator potrzebuje sygnału, gdy target znika lub liczba błędów rośnie.

## Cel nauki

Poznaj regułę alertową czas trwania i opis problemu.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/observability/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Wybierz metrykę dostępności
2. Dodaj wyrażenie i czas trwania
3. Opisz wpływ i wstępną diagnozę
4. Zasymuluj brak targetu

## Kryteria zaliczenia

- Reguła ma konkretny warunek
- Opis pomaga w diagnozie
- Test można powtórzyć

## Weryfikacja

Sprawdź status alertu

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Zacznij od up == 0 dla targetu
2. **Kierunek:** for może ograniczyć flapping, ale opóźnia alarm
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Testuj tylko własne usługi
