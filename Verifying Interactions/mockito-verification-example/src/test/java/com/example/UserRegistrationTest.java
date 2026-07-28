package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.verifyNoMoreInteractions;

class UserRegistrationTest {

    @Test
    void shouldSendWelcomeNotificationForValidEmail() {
        NotificationService notificationService = mock(NotificationService.class);
        UserRegistration userRegistration = new UserRegistration(notificationService);

        userRegistration.register("user@example.com");

        verify(notificationService).sendWelcomeEmail("user@example.com");
        verifyNoMoreInteractions(notificationService);
    }

    @Test
    void shouldRejectInvalidEmailWithoutSendingNotification() {
        NotificationService notificationService = mock(NotificationService.class);
        UserRegistration userRegistration = new UserRegistration(notificationService);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> userRegistration.register("invalid-email")
        );

        assertEquals("Invalid email", exception.getMessage());
        verifyNoInteractions(notificationService);
    }
}
