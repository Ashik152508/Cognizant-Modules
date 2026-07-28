package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;
    private List<String> events;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        events = new ArrayList<>();
        events.add("setup");
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        events.clear();
    }

    @Test
    void addTwoNumbers() {
        int result = calculator.add(2, 3);

        assertEquals(5, result);
        assertTrue(events.contains("setup"));
    }

    private static class Calculator {
        int add(int a, int b) {
            return a + b;
        }
    }
}
