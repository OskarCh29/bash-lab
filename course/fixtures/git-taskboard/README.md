# Git TaskBoard fixture

Mały projekt Java bez Mavena i frameworków. Traktuj pliki jak artefakty repozytorium do zmian, porównywania i diagnozy.

## Sandbox
Z katalogu głównego repo:
    cp -R course/fixtures/git-taskboard /tmp/git-taskboard-lab
    cd /tmp/git-taskboard-lab
    git init -b main
    git add .
    git commit -m "chore: add TaskBoard fixture"

Jeśli katalog już istnieje, wybierz inną ścieżkę. W razie potrzeby ustaw lokalny user.name i user.email.

## Konflikt na tej samej linii
W src/TaskFormatter.java są zakomentowane warianty TASK oraz CURRENT. W pierwszej gałęzi zastąp aktywną linię return "Status: " + status; wariantem TASK i zacommituj. W drugiej gałęzi utworzonej z tej samej bazy zastąp dokładnie tę samą linię wariantem CURRENT. Merge powinien wywołać konflikt.
