FROM maven:3.8.3-openjdk-17 AS build

COPY ..

RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim

COPY --from=build /target/FindMyMechanicJava-0.0.1-SNAPSHOT.jar.demo.jar

ENTRYPOINT ["java" , "-jar" , "FindMyMechanicJava.jar"]