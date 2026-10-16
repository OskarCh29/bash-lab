---
id: "T-0068"
title: "Napraw przerwany ruch między kontenerami"
module: "07-docker-compose"
level: 4
duration_minutes: 30
requires: ["T-0067"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0068 — Napraw przerwany ruch między kontenerami

> Moduł: Docker — od obrazu do aplikacji · Poziom 4 · 30 min

## Misja

Oba kontenery są running, ale endpoint zależny zwraca błąd. Znajdź problem adresu portu lub DNS.

## Cel nauki

Diagnozuj komunikację między usługami.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/docker/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Zapisz działający wynik bazowy
2. Zmień PROFILE_API_URL w kontrolowany sposób
3. Sprawdź ps logs i połączenie w sieci
4. Napraw i zweryfikuj endpoint

## Kryteria zaliczenia

- Diagnoza wskazuje konkretną przyczynę
- Nie zapisujesz IP na stałe
- Endpoint działa po naprawie

## Weryfikacja

Porównaj health obu usług i log task-api

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Błąd upstreamu i błąd własnej usługi to różne sprawy
2. **Kierunek:** Diagnozuj DNS i port zanim restartujesz Docker
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Nie zmieniaj konfiguracji poza labem
