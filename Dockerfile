FROM eclipse-temurin:17-jdk-focal
ADD target/portfolio-0.0.1-SNAPSHOT.jar portfolio-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "portfolio-0.0.1-SNAPSHOT.jar"]
