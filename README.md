# spring-boot-open-feign-demo

## Overview
spring-boot-open-feign-demo is a Spring Boot-based project that demonstrates interservice communication using OpenFeign. It showcases how microservices interact seamlessly in a distributed architecture.

---

## Features
- **Interservice Communication**: Declarative REST client functionality with OpenFeign.
- **Spring Boot Integration**: Rapid development and easy configuration.
- **Maven Build**: Dependency management and build process.
- **MySQL Integration**: Persistent storage for microservices.

---

## Prerequisites
- **Java**: 17 or higher
- **Maven**: 3.8 or higher
- **Spring Boot**: 3.4.3
- **MySQL**: Running instance for database integration

---

## Getting Started

### Clone the Repository
```bash
git clone https://github.com/ibrahimnadra/spring-boot-open-feign-demo.git
```

### Team Service Setup
1. Navigate to the team service directory:
   ```bash
   cd spring-boot-open-feign-demo/teamService
   ```
2. Configure the database connection in `application.properties`.
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. Access the service at `http://localhost:8081`.

### Player Service Setup
1. Navigate to the player service directory:
   ```bash
   cd spring-boot-open-feign-demo/playerService
   ```
2. Configure the database connection in `application.properties`.
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. Access the service at `http://localhost:8080`.

---

## Services

### Player Service

#### Overview
The Player Service manages player-related data, including creating, retrieving, and filtering players by team. It communicates with other microservices to enable seamless data exchange.

#### Features
- **CRUD Operations**: Create, retrieve, and list players.
- **Team-based Filtering**: Retrieve players by team ID.
- **Database Integration**: Persistent storage using MySQL.
- **RESTful API**: Exposes endpoints for external communication.

#### Configuration
```ini
spring.application.name=playerService
spring.datasource.url=jdbc:mysql://localhost:3306/microservicesDemo
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
server.port=8080
```

#### API Endpoints
- **POST /player**: Create a new player.
- **GET /player/{playerId}**: Retrieve a player by ID.
- **GET /player**: Retrieve all players.
- **GET /player/team/{teamId}**: Retrieve players by team ID.

---

### Team Service

#### Overview
The Team Service manages team-related data and integrates with the Player Service using OpenFeign.

#### Features
- **CRUD Operations**: Create, retrieve, update, and delete teams.
- **Integration**: Communicates with Player Service using OpenFeign.
- **Database Integration**: Persistent storage using MySQL.

#### Configuration
```ini
spring.application.name=teamService
spring.datasource.url=jdbc:mysql://localhost:3306/microservicesDemo
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
server.port=8081
```

#### API Endpoints
- **POST /teams**: Create a new team.
- **GET /teams/{id}**: Retrieve a team by ID along with players.
- **GET /teams**: Retrieve all teams along with players.
- **PUT /teams/{id}**: Update a team.
- **DELETE /teams/{id}**: Delete a team.

---