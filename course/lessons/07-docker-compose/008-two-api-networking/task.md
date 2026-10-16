---
id: "T-0067"
title: "Połącz dwie API przez Compose"
module: "07-docker-compose"
level: 3
duration_minutes: 30
requires: ["T-0066"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0067 — Połącz dwie API przez Compose

> Moduł: Docker — od obrazu do aplikacji · Poziom 3 · 30 min

## Misja

Task API wywołuje Profile API, ale oba działają w osobnych kontenerach.

## Cel nauki

Ćwicz service DNS porty i zmienne środowiskowe.

## Materiały

- [Materiały tej lekcji](materials/README.md)
- Wspólne fixture: course/fixtures/apps/ and course/fixtures/docker/
- Uzupełnij result.md rzeczywistymi wynikami terminala.

## Zadania

1. Skopiuj oba źródła do solution
2. Napisz dwa Dockerfile
3. Zdefiniuj Compose z dwoma usługami
4. Ustaw PROFILE_API_URL na nazwę usługi
5. Wywołaj endpoint zależny

## Kryteria zaliczenia

- Obie usługi są zdrowe
- Task API osiąga profile API przez service DNS
- Nie używasz localhost jako adresu peer

## Weryfikacja

Uruchom Compose sprawdź logi i /api/tasks/with-owner

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Loopback kontenera to nie inna usługa
2. **Kierunek:** Nazwa usługi działa jak DNS wewnątrz sieci Compose
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala. Poproś o wyjaśnienie i jeden kolejny eksperyment zamiast od razu o rozwiązanie.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie: co zrobiłeś samodzielnie, gdzie potrzebowałeś pomocy, jaki błąd popełniłeś i co warto powtórzyć.

## Porządkowanie

Sprawdź wolumeny przed down -v
