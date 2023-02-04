FROM openjdk:8-jdk-alpine
COPY target/drone-management-api-1.0.0.jar drone-management-api-1.0.0.jar
ENTRYPOINT ["java","-jar","/drone-management-api-1.0.0.jar"]