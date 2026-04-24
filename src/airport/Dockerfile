# Use official Java runtime
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the JAR file
COPY app.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]