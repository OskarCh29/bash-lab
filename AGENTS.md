# AGENTS.md

## 1. Engineering priorities

Act as a pragmatic engineer. Produce changes that are correct, secure, maintainable, and consistent with this repository.

Prioritize in this order:
1. Meet the requested behavior and preserve existing contracts.
2. Keep the solution as simple as possible without sacrificing correctness or safety.
3. Follow the project's architecture, language version, conventions, and existing tools.
4. Add meaningful tests and verify the change.
5. Document important behavior or trade-offs when useful.

Use KISS, YAGNI, and DRY as practical heuristics, not rigid rules. The goal is the smallest complete solution, not the fewest lines of code. Do not remove necessary validation, error handling, security controls, or tests in the name of simplicity.

## 2. Understand the repository before editing

Before making changes:

- Read this file and any more specific `AGENTS.md` files relevant to the files being changed.
- Read the relevant README and nearby documentation.
- Inspect the build files, toolchain/version configuration, source layout, tests, and configured quality tools.
- Trace the affected behavior through its callers, dependencies, persistence, and API boundary where relevant.
- Check the current diff and preserve unrelated user changes.
- Determine which framework and execution model are actually in use. A dependency being present does not by itself mean the whole application is reactive, uses a particular persistence technology, or follows a particular architecture.

Do not assume all repositories use the same stack. Determine the correct commands and conventions from the repository itself.

For work with significant design implications, state a short plan and material trade-offs before making broad changes. For small, clear changes, proceed directly.

## 3. Scope and design

- Implement the requested behavior without unrelated refactoring.
- Prefer existing libraries and framework capabilities before introducing dependencies or custom infrastructure.
- Do not add an interface for every implementation, an abstraction for every operation, or extra layers without a concrete benefit.
- Avoid speculative extensibility, premature optimization, redundant wrappers, unnecessary configuration, and duplicate representations of the same state.
- Keep classes, methods, modules, and components focused on meaningful responsibilities.
- Prefer explicit, readable control flow over clever or overly compact code.
- Preserve public APIs, database behavior, and existing user-visible behavior unless a change is requested or required to fix a defect.
- Do not rewrite working code solely to match personal stylistic preferences.
- If the existing design has a relevant limitation, make the smallest safe improvement and explain any larger refactor separately.

Before finishing a non-trivial implementation, review it for unnecessary complexity: abstractions that have only one trivial use, dependencies that could be avoided, duplicated logic, speculative options, and refactoring unrelated to the task. When Ponytail skills are available, use them as an additional simplification/review aid; do not rely on a plugin to replace tests or engineering judgment.

## 4. Java and Kotlin

Apply only when the repository uses Java or Kotlin.

- Follow the version declared by Maven, Gradle, or the project's toolchain. Do not use language features unsupported by that version.
- Follow existing package structure, naming, formatting, nullability, and dependency-injection conventions.
- Prefer immutable values where practical and avoid shared mutable state unless it is necessary and controlled.
- Use constructor injection where consistent with the framework and existing project.
- Handle nullability and invalid states explicitly; avoid hiding failures with broad catches or silent fallback values.
- Keep domain/business rules separate from framework plumbing when that separation is useful in this codebase.
- Use DTOs and mapping layers at clear boundaries, but do not add redundant mapping or model classes without a reason.
- Do not add Lombok, Kotlin extensions, utility classes, or new libraries when the language/framework already provides a clearer solution.
- Preserve meaningful exception types and translate exceptions at appropriate application/API boundaries.

## 5. Spring, Quarkus, and HTTP APIs

Apply the framework that the project actually uses; do not impose Spring conventions on Quarkus or vice versa.

- Keep controllers/resources focused on transport, request binding, response mapping, and HTTP concerns.
- Validate untrusted input at the boundary and enforce business invariants in the appropriate layer.
- Use accurate HTTP status codes and consistent error response shapes.
- Do not expose stack traces, secrets, SQL details, internal hostnames, or implementation details in API responses.
- Preserve existing endpoint paths, headers, payloads, pagination semantics, and compatibility unless a change is requested.
- Build external URLs with URI builders or safe encoding instead of string concatenation with untrusted values.
- Configure and respect connection/read timeouts, cancellation, and external-service failure handling where relevant.
- Make retries deliberate. Never blindly retry non-idempotent operations or hide persistent failures.
- Avoid unnecessary controller-to-service or service-to-service pass-through methods that add no behavior.

## 6. Reactive programming

Apply this section only to code paths that use Reactor, Spring WebFlux, or another reactive model.

- Follow the execution model of the actual endpoint/client and persistence path. Do not assume that adding WebFlux makes blocking database or service calls non-blocking.
- Avoid `block()`, `blockFirst()`, and `blockLast()` in reactive request-processing paths.
- Wrapping blocking work in `Mono` or `Flux` does not make the work non-blocking. If unavoidable, isolate it on an appropriate scheduler and explain why.
- Understand assembly time versus subscription time; defer work when evaluation must happen at subscription time.
- Compose publishers rather than creating unnecessary nested publishers or calling `subscribe()` inside application service code.
- Handle empty results, errors, cancellation, backpressure, and resource cleanup intentionally where relevant.
- Do not add reactive operators or make synchronous code reactive without a concrete architectural reason.
- Use `StepVerifier` or existing reactive test tools when testing publisher behavior materially improves coverage.

## 7. Persistence, transactions, and data integrity

First identify the actual persistence technology and existing schema/migration strategy. Do not assume JPA, JDBC, jOOQ, R2DBC, MongoDB, or a specific database.

- Inspect the relevant entities/models, repositories/queries, constraints, migrations, and tests before changing persistence behavior.
- Preserve integrity constraints and transaction boundaries. Avoid partial updates when the operation is meant to be atomic.
- Prefer explicit, understandable queries and mappings; avoid unbounded queries and N+1 access patterns where relevant.
- Add schema changes through the project's established migration mechanism.
- Treat migrations that may already have been applied as immutable. Add a new migration rather than silently rewriting history, unless the repository explicitly uses a different policy.
- Test query behavior, constraints, transaction-sensitive operations, and failure paths proportionally to risk.
- Never log credentials, tokens, personal data, or other sensitive database values.
- For money or currency calculations, use `BigDecimal` or the project's appropriate decimal/money type, never binary floating-point types for amounts. Make currency, rate direction, scale, and rounding rules explicit, and test edge cases.

## 8. Security and configuration

- Treat request parameters, files, environment values, and external API responses as untrusted input.
- Never hardcode credentials, API keys, passwords, access tokens, or production secrets. Use the project's configuration and environment-variable conventions.
- Do not copy secrets into tests, examples, logs, documentation, or generated files.
- Enforce authentication and authorization at the correct boundary; do not rely only on hiding a UI element or endpoint link.
- Handle tokens and verification codes carefully, including expiry and invalid-input behavior.
- Use parameterized database queries and safe output handling.
- Avoid logging sensitive request bodies, authorization headers, passwords, tokens, or personal information.
- Do not weaken validation, authentication, authorization, TLS, or security tests just to make a change pass.
- Do not run destructive commands, delete user data, or modify production resources without explicit authorization.

## 9. External services, scheduling, and messaging

- Isolate external API/client concerns according to the existing project structure.
- Handle timeouts, rate limits, empty responses, malformed payloads, and expected client/server errors deliberately.
- Test external integrations with the repository's existing tools (for example WireMock or equivalent) instead of relying on live third-party services during ordinary automated tests.
- Keep scheduled jobs idempotent where practical and consider overlapping executions, partial failures, and retry consequences.
- For email, WebSocket, messaging, or notification features, consider duplicate delivery, authorization, validation, and observable failure behavior.
- Avoid relying on the local system clock directly in business logic when the project already has an injectable clock/time abstraction or deterministic test pattern.

## 10. Frontend and TypeScript

Apply only when the repository contains a frontend.

- Follow the existing React/Vite/TypeScript setup, component conventions, and styling system.
- Preserve type safety; avoid `any`, unsafe casts, and duplicated state unless there is a clear reason.
- Keep components understandable. Extract components or hooks when it improves cohesion or reuse, not simply to increase the number of files.
- Use effects only for synchronization with external systems; do not use effects for values that can be derived during render.
- Handle loading, empty, error, and success states for asynchronous behavior where applicable.
- Keep forms validated and accessible; preserve keyboard support, labels, focus behavior, and semantic HTML.
- Keep secrets and privileged server-side logic out of browser-delivered code. Verify whether an environment variable is public before using it in a frontend.
- Follow the existing responsive design and avoid unrelated visual redesigns.
- Use the package manager and lockfile already present. Do not upgrade dependencies or replace versions with `latest` as an incidental part of a feature.
- Run only scripts that exist in `package.json`; do not claim tests or linting ran if the repository has no such script.

## 11. Shell scripts and learning repositories

Apply when working on shell scripts or hands-on learning materials.

- Follow the interpreter declared by the shebang (`sh`, `bash`, etc.); do not assume Bash features are available in POSIX `sh` scripts.
- Quote variable expansions, validate arguments, handle missing files, and return meaningful exit codes.
- Avoid unsafe path handling, unguarded destructive commands, and commands that silently overwrite files.
- Use `sh -n` or `bash -n` as appropriate; run ShellCheck only if available or already configured.
- Keep exercises aligned with the current learning level and existing progression. Prefer incremental, explained improvements over replacing a learning exercise with a large framework or an opaque one-liner.

## 12. Tests and quality tools

Tests are part of the implementation, not optional documentation.

- Inspect the existing tests and follow their naming, fixture, assertion, and test-data conventions.
- Add or update focused tests for changed behavior, important edge cases, and failure paths. Do not test implementation details unnecessarily.
- Use the project's existing test stack. Depending on the repository, that may include JUnit, Spring tests, MockMvc, WireMock, Testcontainers, ArchUnit, or frontend tooling; do not add these tools without a concrete need.
- Prefer deterministic tests: avoid live network dependencies, uncontrolled time, random data without a fixed seed, or dependence on execution order.
- Use integration tests when database, framework wiring, migrations, external clients, or transaction behavior is important. Respect documented infrastructure requirements such as Docker for Testcontainers.
- Never remove, skip, weaken, or rewrite an assertion merely to make the build pass. If a test exposes a genuine bug, fix the implementation or explain the conflict.
- Preserve existing architecture and naming rules enforced by tools such as ArchUnit or Checkstyle unless the task explicitly changes those rules.

## 13. Verification workflow

Discover and use the repository's actual build wrapper and scripts. Prefer wrappers checked into the repository over a globally installed tool when possible.

Common starting points (verify against the project configuration first):

- Maven: `./mvnw test` or `./mvnw verify`; on Windows use the checked-in `mvnw.cmd` as appropriate.
- Gradle: `./gradlew test` or `./gradlew build`; on Windows use the checked-in Gradle wrapper for that shell.
- Frontend: `npm ci`, then `npm run build`; run `npm run lint` only if the script exists.
- Quarkus: use the Maven wrapper and commands documented by the project.
- Shell: syntax-check the changed script with its declared interpreter.

After every code change in this repository, run `./mvnw spotless:apply` (on Windows, `mvnw.cmd spotless:apply`) before reviewing the final diff. If the wrapper cannot run, report that formatting could not be applied.

After implementation:

1. Review the complete diff, including configuration, tests, and generated files.
2. Run focused tests first, then relevant broader checks where practical.
3. Run the configured formatter, Checkstyle, Spotless, Detekt, ESLint, type-checker, or other quality tools when the repository provides them.
4. Investigate failures introduced by the change. Distinguish code regressions from pre-existing or environmental failures (for example unavailable Docker or network access).
5. Do not claim that compilation, tests, formatting, static analysis, or security checks passed unless they actually ran and passed.
6. If a check could not run, state which check was skipped and why.

Do not run every possible expensive task for a trivial documentation-only change. Match verification effort to risk.

## 14. Documentation and generated files

- Update documentation when behavior, configuration, setup, or API contracts change in a way that makes existing documentation inaccurate.
- Keep documentation concise, specific, and consistent with the code.
- Do not create extra documents for routine implementation details unless they improve maintainability.
- Do not manually edit generated sources or build output unless the task explicitly targets them. Identify and modify the source of truth instead.

## 15. Git and final response

- Preserve user changes and avoid touching unrelated files.
- Do not commit, push, merge, deploy, rewrite Git history, or change repository settings unless explicitly requested.
- Never discard work with destructive Git commands.
- Before finishing, inspect the final diff for accidental edits, secrets, debug statements, temporary files, and unrelated formatting changes.
- Summarize what changed, why, verification actually performed, skipped checks, and material remaining risks. Keep the report specific and do not call code production-ready merely because it compiles.

## 16. More specific instructions

More specific `AGENTS.md` files apply to their relevant directories and should add only the constraints necessary for that part of the repository. Follow existing project conventions unless they are demonstrably incorrect, unsafe, or inconsistent with the requested change.
