---
id: "T-0065"
title: "Zrozum build context i dockerignore"
module: "07-docker-compose"
level: 2
duration_minutes: 25
requires: ["T-0030"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0065 — Zrozum build context i dockerignore

> Moduł: Docker — od obrazu do aplikacji · Poziom 2 · 25 min

## Misja

Obraz jest duży, bo kontekst zawiera repo, artefakty i lokalne pliki.

## Cel nauki

Poznaj kontekst budowania i wykluczanie plików.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/docker/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Skopiuj fixture do solution
2. Zbuduj obraz i obejrzyj log
3. Dodaj dockerignore
4. Porównaj, co trafia do kontekstu

## Kryteria zaliczenia

- Kontekst nie zawiera sekretów i lokalnych logów
- Rozumiesz różnicę kontekstu i obrazu
- Build działa

## Weryfikacja

Porównaj build przed i po dockerignore

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Sprawdź ostatni argument docker build
2. **Kierunek:** Nie dodawaj całego repo bez powodu
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Nie używaj prawdziwych sekretów
