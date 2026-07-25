import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void addShouldReturnSum() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtractShouldReturnDifference() {
        assertEquals(1, calculator.subtract(4, 3));
    }

    @Test
    void multiplyShouldReturnProduct() {
        assertTrue(calculator.multiply(3, 4) == 12);
    }

    @Test
    void divideShouldReturnQuotient() {
        assertEquals(4, calculator.divide(8, 2));
    }

    @Test
    void divideByZeroShouldThrowException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
        assertEquals("Divisor cannot be zero", exception.getMessage());
    }
}
