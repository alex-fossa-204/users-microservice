# BASE DOCKER IMAGE
FROM openjdk:17-jdk-alpine
ADD target/users-0.0.1-SNAPSHOT.jar users.jar
ENTRYPOINT ["java", "-jar", "users.jar"]