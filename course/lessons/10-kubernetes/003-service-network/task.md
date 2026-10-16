---
id: "T-0043"
title: "Udostępnij aplikację przez Service"
module: "10-kubernetes"
level: 3
duration_minutes: 25
requires: ["T-0042"]
deliverable: "artefakt ćwiczeniowy"
---

# T-0043 — Udostępnij aplikację przez Service

> Moduł: Kubernetes — wdrożenie i diagnoza · Poziom 3 · 25 min

## Misja

Adres Poda może się zmieniać. Dodaj stabilny punkt dostępu i przetestuj lokalnie.

## Cel nauki

Poznaj selektory porty i Service.

## Zadania

1. Dodaj Service z pasującym selektorem
2. Rozróżnij port i targetPort
3. Sprawdź endpoints i wykonaj żądanie
4. Opisz dostęp lokalny

## Kryteria zaliczenia

- Service wybiera właściwe Pody
- Porty pasują do aplikacji
- Nie wystawiasz niepotrzebnie publicznego endpointu

## Weryfikacja

Sprawdź kubectl get svc,endpoints i dostęp przez Minikube

## Podpowiedzi — otwieraj stopniowo

1. **Mała wskazówka:** Selektor pasuje do etykiet
2. **Kierunek:** Nie myl portu usługi i kontenera
3. **Gdy nadal utkniesz:** pokaż AI konkretny wynik z terminala; poproś o wyjaśnienie i jeden mały eksperyment, nie gotową odpowiedź.

## Raport po zadaniu

Zapisz w prywatnym Obsidianie:
- Co wykonałem samodzielnie?
- Gdzie potrzebowałem pomocy?
- Jaki błąd popełniłem i co było przyczyną?
- Czy umiem odtworzyć rozwiązanie bez kopiowania?
- Co powinienem powtórzyć?

## Porządkowanie

Nie twórz publicznego endpointu
