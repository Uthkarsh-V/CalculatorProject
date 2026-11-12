import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void addsNumbers() {
        assertEquals(7.0, Calculator.add(3.0, 4.0));
    }

    @Test
    void subtractsNumbers() {
        assertEquals(2.0, Calculator.subtract(5.0, 3.0));
    }

    @Test
    void multipliesNumbers() {
        assertEquals(12.0, Calculator.multiply(3.0, 4.0));
    }

    @Test
    void dividesNumbers() {
        assertEquals(2.5, Calculator.divide(5.0, 2.0));
    }

    @Test
    void rejectsDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(5.0, 0.0));
    }
}
