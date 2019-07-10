package pl.sdacademy.calculations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorDemoTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("nowaNazwaMordeczki")
    void shouldMultiplyValues() {
        final Double value1 = 2.0;
        final Double value2 = 3.1;
        final Double expectedResult = 6.2;


        final Double multiplicationResult = calculator.multiply(value1, value2);

        assertEquals(expectedResult, multiplicationResult);
    }

    @Test
    @Disabled
    void shouldSumValues() {
        final Double value1 = 2.5;
        final Double value2 = 3.8;
        final Double expectedResult = 6.3;

        final Double sumResult = calculator.add(value1, value2);

        assertEquals(expectedResult, sumResult);
    }

    @Test
    void shouldSubtractValues() {
        final Double value1 = 2.5;
        final Double value2 = 3.8;
        final double expectedResult = -1.3;
        final double delta = 0.1;

        final Double subtractResult = calculator.subtract(value1, value2);

        assertEquals(expectedResult, subtractResult, delta);
    }

    @Test
    @DisplayName("Hello")
    @Disabled("for now")
    void shouldFail() {
        assertEquals(1, 2, "This assertion always fails");
    }
}