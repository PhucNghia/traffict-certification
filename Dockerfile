# syntax=docker/dockerfile:1
# FROM openjdk:21-oraclelinux8
FROM openjdk:oraclelinux8
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod 777 ./mvnw
RUN ./mvnw dependency:go-offline
COPY src ./src
CMD ["./mvnw", "spring-boot:run"]