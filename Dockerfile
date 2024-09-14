# Use an official OpenJDK runtime as a parent image
FROM openjdk:22
WORKDIR /app
COPY target/photo-editor-service.jar /app/photo-editor-service.jar
EXPOSE 8080
CMD ["java", "-jar", "photo-editor-service.jar"]