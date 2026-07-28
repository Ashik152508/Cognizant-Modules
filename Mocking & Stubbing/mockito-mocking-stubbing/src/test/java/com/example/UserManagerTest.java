package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserManagerTest {

    @Test
    void shouldReturnDisplayNameWhenUserServiceReturnsName() {
        UserService userService = Mockito.mock(UserService.class);
        Mockito.when(userService.getUserName(42)).thenReturn("Alice");

        UserManager manager = new UserManager(userService);

        assertEquals("User: Alice", manager.getDisplayName(42));
    }

    @Test
    void shouldReturnUnknownWhenUserServiceReturnsNull() {
        UserService userService = Mockito.mock(UserService.class);
        Mockito.when(userService.getUserName(7)).thenReturn(null);

        UserManager manager = new UserManager(userService);

        assertEquals("User: Unknown", manager.getDisplayName(7));
    }
}
