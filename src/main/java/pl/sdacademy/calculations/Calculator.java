package pl.sdacademy.calculations;

import pl.sdacademy.exceptions.DivisionByZeroException;

public class Calculator {

    public Double add(final Double first, final Double second) {

        return first + second;
    }

    public Double subtract(final Double minuend, final Double subtrahend)
    {
        return minuend - subtrahend;
    }

    public Double multiply(final Double first, final Double second) {

        return first * second;
    }

    public Double divide(final Double dividend, final Double divisor) {
        if (divisor.equals(0.0)) {
            throw new DivisionByZeroException("Cannot divide by 0!");
        }
        return dividend / divisor;
    }
}
