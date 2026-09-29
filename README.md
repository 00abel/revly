# Revly

A social app for Washington car enthusiasts. Find great driving roads, log your drives, and meet up with other drivers.

**Status:** In development. Week 1 is done: the Road entity, repository, and REST controller. Next up: drive tracking and road ratings.

## Planned features

- Post and rate driving roads with photos
- Log drives and track total distance
- Community leaderboard
- Build profiles for your car
- Organize car meets
- Ask and answer car questions

## Tech stack

- Java, Spring Boot
- Spring Data JPA (Hibernate)
- PostgreSQL
- Maven

## Run it locally

Requirements: Java 17+ and PostgreSQL.

1. Create a database named `revly`:
```
   createdb revly
```
2. Set your database password as an environment variable:
```
   export DB_PASSWORD=your_password
```
3. Start the app:
```
   ./mvnw spring-boot:run
```

The app connects to `localhost:5432/revly` as the `postgres` user. Change this in `src/main/resources/application.properties` if your setup is different.

## Roadmap

- [x] Road entity, repository, controller
- [ ] Drive tracking
- [ ] Road ratings
- [ ] User accounts and build profiles
- [ ] Leaderboard
- [ ] Web frontend
- [ ] Mobile app