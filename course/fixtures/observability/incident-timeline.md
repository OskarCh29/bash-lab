# Przykładowa oś czasu

- 10:00 — obie usługi odpowiadają na health.
- 10:04 — task-api zgłasza wolny upstream.
- 10:05 — /api/tasks/with-owner zwraca 502.
- 10:06 — /health task-api nadal zwraca 200.
- 10:07 — log pokazuje connection refused do profile-api:8081.

Dane fikcyjne. Oddziel obserwacje od hipotezy.
