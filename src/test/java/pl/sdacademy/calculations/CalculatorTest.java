package pl.sdacademy.calculations;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sdacademy.exceptions.DivisionByZeroException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoNumbers (){

        //given
        final double numA =2;
        final double numB =3;
        //when
        final double actualResult = calculator.add(numA, numB);
        //then
        assertEquals(5, actualResult);

    }

    @Test
    void shouldsubtractTwoNumbers (){
        //given
        final double numA =3.8;
        final double numB =2.5;
        //when
        final double actualResult = calculator.subtract(numB, numA);
        //then
        assertEquals(-1.3, actualResult,0.1);

    }

    @Test
    void shouldMultiplyTwoNumbers (){
        //given
        final double numA =1.8;
        final double numB =3.1;
        //when
        final double actualResult = calculator.multiply(numB, numA);
        //then
        assertEquals(5.58, actualResult);

    }

    @Test
    void shouldThrowDevisionByZeroException(){

        final double numA = 2.0;
        final double numB = 0.0;

        try {
            calculator.divide(numA,numB);
            fail("Exception not throw");
        }catch (final DivisionByZeroException exp){
            assertThat(exp.getMessage()).isEqualTo("Cannot divide by 0!");
            assertThat(exp).hasNoCause();
        }

    }


}