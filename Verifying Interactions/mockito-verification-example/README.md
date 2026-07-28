# Mockito Verification Example

This project demonstrates how to verify interactions with Mockito using JUnit 5.

## Structure

- `src/main/java/com/example/NotificationService.java` defines a notification dependency.
- `src/main/java/com/example/UserRegistration.java` registers a user and notifies the service.
- `src/test/java/com/example/UserRegistrationTest.java` verifies that the notification is sent only for valid input.

## Run tests

```bash
mvn test
```
