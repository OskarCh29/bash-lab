---
id: "T-0026"
title: "Prześledź wywołanie upstreamu"
module: "06-service-integration"
level: 2
duration_minutes: 25
requires: ["T-0025"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0026 — Prześledź wywołanie upstreamu

> Moduł: Integracja dwóch usług REST · Poziom 2 · 25 min

## Misja

Endpoint task-api /api/tasks/with-owner pobiera profil z profile-api. Ustal przepływ i konfigurację.

## Cel nauki

Rozumiej zależność usługa-usługa i adres upstreamu.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Uruchom obie usługi
2. Wywołaj endpoint zależny
3. Zmień PROFILE_API_URL i ponów test
4. Zapisz przepływ w result.md

## Kryteria zaliczenia

- Wskazujesz klienta i upstream
- Wiesz, gdzie ustawiony jest URL
- Odpowiedź potwierdza zależność od obu procesów

## Weryfikacja

Zatrzymaj profile-api i powtórz żądanie

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Szukaj PROFILE_API_URL w task-api
2. **Kierunek:** Task API składa odpowiedź z danych upstreamu
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Zatrzymaj własne procesy
