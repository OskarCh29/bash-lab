---
id: "T-0021"
title: "Utwórz projekt Maven"
module: "05-java-testing-build"
level: 2
duration_minutes: 25
requires: ["T-0020"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0021 — Utwórz projekt Maven

> Moduł: Java — Maven i testy · Poziom 2 · 25 min

## Misja

Przygotuj projekt Java, który buduje się na innym komputerze bez ręcznego podpinania bibliotek.

## Cel nauki

Poznaj pom.xml, standardowy layout i lifecycle Mavena.

## Zadania

1. Utwórz src/main/java i src/test/java
2. Skonfiguruj pom.xml i wersję Javy
3. Uruchom mvn test i package
4. Sprawdź target i gitignore

## Kryteria zaliczenia

- Build działa z terminala
- Źródła są w standardowych katalogach
- Pliki generowane nie trafiają do Gita

## Weryfikacja

Usuń target i wykonaj mvn clean verify

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Sprawdź wersję JDK i Mavena
2. **Kierunek:** Maven bazuje na pom.xml i konwencjach
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Nie commituj target
