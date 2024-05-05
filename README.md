# transfer-service-hexagonal-architecture

transfer-service is a Spring Boot application that handles deposit and refund transfer types.

---

### Technologies / Changes

* Java 21
* Spring Boot 3.2.5
* Build tool: Maven 3.9.6
* Use docker-compose TestContainers for Integration Tests
* The use of [Spring Data JDBC](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/)(NOT Spring Data
  with Hibernate) to skip boilerplate code for DB handling.

---

### How to run locally

#### Prerequisites

- JDK 21

### Build

- Go to root directory and run: `./mvnw clean install`

### Run

1. While in the `/scripts/` folder, run `./start-services.sh`.
2. Run `./create-database.sh` in the `/scripts/` folder.
3. Start up the application using the liquibase profile: `./mvnw spring-boot:run -Dspring.profiles.active=liquibase`
4. If you want to play around with db, you can run
   `docker ps` and grabbing Container ID for the postgres image and follow with
   `docker exec -it ${ContainerId} psql transfer_service -U postgres`
   While in the container, run `\dt transfer_service.` -- you should see a list of created tables.

---

### API Documentation

http://localhost:8080/swagger-ui

### Log files

### Monitoring and Alerts

### Concepts

#### Ports and Adapters Pattern

This pattern is used in the project, it is also known as, hexagonal architecture

https://en.wikipedia.org/wiki/Hexagonal_architecture_(software)

### Improvement points
