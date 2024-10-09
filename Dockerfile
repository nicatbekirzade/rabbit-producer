# Use an official JDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from your build system to the container
COPY build/libs/rabbit-producer-0.0.1-SNAPSHOT.jar /app/application.jar

# Expose the port that the application runs on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/application.jar"]