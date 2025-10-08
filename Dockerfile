#FROM openjdk:17
#WORKDIR /usr/src/bootapp
#COPY target/ElectronicStore-0.0.1-SNAPSHOT.jar app.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "app.jar"]
# Step 1: Build the JAR file
# Step 1: Build stage — compile and package your Spring Boot app
FROM maven:3.9.4-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Runtime stage — run your packaged JAR
FROM openjdk:17
WORKDIR /usr/src/bootapp
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

