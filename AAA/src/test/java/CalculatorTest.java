import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void addReturnsSum() {
        // Arrange
        int first = 3;
        int second = 4;

        // Act
        int result = calculator.add(first, second);

        // Assert
        assertEquals(7, result);
    }

    @Test
    void divideThrowsWhenDivisorIsZero() {
        // Arrange
        int dividend = 10;
        int divisor = 0;

        // Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(dividend, divisor));

        // Assert
        assertEquals("Divisor cannot be zero", exception.getMessage());
    }
}
