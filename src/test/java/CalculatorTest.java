
import static org.junit.jupiter.api.Assertions.*;
import org.example.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testSquareRoot() {
        assertEquals(4.0, Calculator.squareRoot(16), 0.0001);
    }

    @Test
    void testFactorial() {
        assertEquals(120, Calculator.factorial(5));
        assertEquals(1, Calculator.factorial(0));
    }

    @Test
    void testNaturalLog() {
        assertEquals(0.0, Calculator.naturalLog(1), 0.0001);
    }

    @Test
    void testPowerFunction() {
        assertEquals(8.0, Calculator.power(2, 3), 0.0001);
    }

    @Test
    void testNegativeSquareRoot() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.squareRoot(-4));
    }

    @Test
    void testNegativeFactorial() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.factorial(-5));
    }

    @Test
    void testZeroOrNegativeLog() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.naturalLog(0));
        assertThrows(IllegalArgumentException.class, () -> Calculator.naturalLog(-10));
    }
}