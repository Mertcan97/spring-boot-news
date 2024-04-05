# Association Management API with Spring Boot

## Introduction

This project is a RESTful API developed using Spring Boot for managing association activities and announcements. It provides endpoints to perform CRUD (Create, Read, Update, Delete) operations on activities and announcements.

## Getting Started

### Prerequisites

- Java JDK 8 or above
- PostgreSQL database

### Installation

1. Clone the project:

git clone https://github.com/mertcanyardimci/Association-Management-API-with-Spring-Boot.git


2. Create a database named `db_activities` in PostgreSQL.

3. Edit the `application.properties` file to provide your database connection details:

spring.datasource.url=jdbc:postgresql://localhost:5432/db_activities?currentSchema=sc_activities&ssl=false
spring.datasource.username=admin
spring.datasource.password=12345
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect


4. Run the application:

./mvnw spring-boot:run


5. Once the application is running successfully, you can access the API at http://localhost:8080.

## Usage

### Activities

- **Get All Activities**
  - Endpoint: GET /activities
  - Example: http://localhost:8080/activities

- **Add a New Activity**
  - Endpoint: POST /activities
  - Example: 
    ```
    curl -X POST -H "Content-Type: application/json" -d '{"name":"New Activity","description":"Description","date":"2024-04-05T10:00:00"}' http://localhost:8080/activities
    ```

- **Delete a Specific Activity**
  - Endpoint: DELETE /activities/{id}
  - Example: http://localhost:8080/activities/1

### Announcements

- **Get All Announcements**
  - Endpoint: GET /announcements
  - Example: http://localhost:8080/announcements

- **Add a New Announcement**
  - Endpoint: POST /announcements
  - Example: 
    ```
    curl -X POST -H "Content-Type: application/json" -d '{"title":"New Announcement","content":"Content","date":"2024-04-05T10:00:00"}' http://localhost:8080/announcements
    ```

- **Delete a Specific Announcement**
  - Endpoint: DELETE /announcements/{id}
  - Example: http://localhost:8080/announcements/1
