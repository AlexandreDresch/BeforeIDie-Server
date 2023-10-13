FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get instal openjdk-17-jdk -y

COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /target/beforeidie-1.0.0.jar app.jar

ENTRYPOINT [ "java", "-jav", "app.jar"]