package com.example;

public class UserRegistration {
    private final NotificationService notificationService;

    public UserRegistration(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void register(String email) {
        if (email == null || email.isBlank() || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        notificationService.sendWelcomeEmail(email);
    }
}
