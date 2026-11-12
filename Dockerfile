FROM maven:3.9-eclipse-temurin-25 AS build
WORKDIR /workspace
COPY pom.xml .
COPY src ./src
RUN mvn -B test

FROM nginx:1.27-alpine
COPY calculator.html /usr/share/nginx/html/index.html
EXPOSE 80
