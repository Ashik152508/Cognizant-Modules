package com.example;

public class UserManager {
    private final UserService userService;

    public UserManager(UserService userService) {
        this.userService = userService;
    }

    public String getDisplayName(int userId) {
        String userName = userService.getUserName(userId);
        return userName != null ? "User: " + userName : "User: Unknown";
    }
}
