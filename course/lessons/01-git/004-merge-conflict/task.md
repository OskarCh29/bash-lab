---
id: "T-0008"
title: "Wywołaj i rozwiąż prawdziwy konflikt merge"
module: "01-git"
level: 2
duration_minutes: 30
requires: ["T-0007"]
deliverable: "rozwiązany-konflikt"
---

# T-0008 — Wywołaj i rozwiąż prawdziwy konflikt merge

## Misja
Dwie gałęzie zmieniają tę samą linię w pliku Java. Wywołaj konflikt celowo, odczytaj znaczniki i uzgodnij poprawny rezultat.

## Cel nauki
Rozumieć wspólny przodek, konflikt treści i bezpieczne rozwiązanie merge.

## Materiały
- [Materiały lekcji](materials/README.md)
- [Git TaskBoard fixture](../../../fixtures/git-taskboard/)
- Uzupełnij result.md.

## Przygotowanie sandboxa
Z katalogu głównego skopiuj fixture do /tmp/git-taskboard-lab. Zainicjalizuj tam main, dodaj pliki i utwórz commit bazowy. Nie ćwicz w swoim głównym repo.

## Zadania
1. Utwórz branch feature/task-label. Zmień aktywną linię return "Status: " + status; na wariant TASK z komentarza i zacommituj.
2. Wróć do bazy i utwórz feature/current-label. Zmień dokładnie tę samą aktywną linię na wariant CURRENT. Zacommituj.
3. Przełącz się na feature/task-label i scal feature/current-label.
4. Przeczytaj znaczniki konfliktu, wybierz końcowy kontrakt i usuń znaczniki.
5. Dodaj rozwiązanie do staging, obejrzyj diff i zakończ merge.
6. Zapisz decyzję i historię w result.md.

## Kryteria zaliczenia
- Konflikt został wywołany prawdziwym merge.
- Wskazujesz wspólny commit bazowy i różne zmiany gałęzi.
- Plik nie zawiera znaczników <<<<<<<, ======= ani >>>>>>>.
- Historia i result.md potwierdzają rozwiązanie.

## Weryfikacja
Uruchom git status, git diff --check i git log --oneline --graph --decorate.

## Podpowiedzi
1. **Mała wskazówka:** obie gałęzie muszą pochodzić z tego samego commita.
2. **Kierunek:** obie zmiany zastępują tę samą aktywną linię.
3. **Gdy utkniesz:** pokaż AI git status i fragment pliku ze znacznikami. Nie rób reset, zanim nie zapiszesz stanu.

## Raport po zadaniu
Zapisz, co wybrałeś, dlaczego i jak potwierdziłeś rozwiązanie.

## Porządkowanie
Pracuj wyłącznie w kopii pod /tmp. Nie wykonuj force push ani eksperymentów na głównej gałęzi kursu.
