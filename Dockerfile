ARG IMAGE_VERSION=21.0.12.1_1

FROM eclipse-temurin:${IMAGE_VERSION}-jdk AS builder

WORKDIR /app

COPY .mvn/ .mvn
COPY pom.xml mvnw ./
COPY src ./src

RUN ./mvnw --batch-mode verify

FROM eclipse-temurin:${IMAGE_VERSION}-jre AS runtime
WORKDIR /app

COPY --from=builder /app/target/*.jar ./app.jar

RUN addgroup --system app && adduser --system --group app

USER app

ENTRYPOINT ["java","-jar","app.jar"]