
# Stage 1: Build the Java application
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# Stage 2: Run the Java application
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

COPY --from=build /app/target/evenodd-project-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
