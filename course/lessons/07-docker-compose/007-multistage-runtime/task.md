---
id: "T-0066"
title: "Oddziel build od obrazu runtime"
module: "07-docker-compose"
level: 3
duration_minutes: 30
requires: ["T-0065"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0066 — Oddziel build od obrazu runtime

> Moduł: Docker — od obrazu do aplikacji · Poziom 3 · 30 min

## Misja

Finalny obraz nie powinien zawierać kompilatora, gdy wystarczy runtime.

## Cel nauki

Zbuduj wieloetapowy Dockerfile dla aplikacji Java.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/docker/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Utwórz własny kontekst z fixture
2. Dodaj etap JDK do kompilacji
3. Skopiuj tylko wynik do obrazu runtime
4. Uruchom i porównaj

## Kryteria zaliczenia

- Finalny obraz nie potrzebuje źródeł
- Aplikacja działa
- Etapy mają odrębne role

## Weryfikacja

Sprawdź docker image inspect i logi

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Użyj oddzielnych FROM dla build i runtime
2. **Kierunek:** Nie optymalizuj kosztem powtarzalności
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Używaj lokalnego obrazu
