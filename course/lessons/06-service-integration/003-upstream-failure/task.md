---
id: "T-0027"
title: "Zdiagnozuj awarię upstreamu"
module: "06-service-integration"
level: 3
duration_minutes: 30
requires: ["T-0026"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0027 — Zdiagnozuj awarię upstreamu

> Moduł: Integracja dwóch usług REST · Poziom 3 · 30 min

## Misja

task-api zwraca inny wynik, gdy profile-api jest nieosiągalne. Odróżnij awarię zależności od awarii task-api.

## Cel nauki

Diagnozuj częściową awarię między usługami.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Sprawdź health obu usług
2. Zatrzymaj profile-api i ponów /api/tasks/with-owner
3. Porównaj /health i /api/tasks
4. Zapisz symptom dowody hipotezę i naprawę

## Kryteria zaliczenia

- Wskazujesz endpointy działające mimo awarii upstreamu
- Raport wykorzystuje statusy i logi
- Nie restartujesz wszystkiego bez powodu

## Weryfikacja

Uruchom profile-api i potwierdź powrót endpointu

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Porównaj endpoint niezależny i zależny
2. **Kierunek:** Sprawdź URL i port przed uznaniem problemu za błąd kodu
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Przywróć i zatrzymaj własne procesy
