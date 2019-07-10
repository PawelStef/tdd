package pl.sdacademy.calculations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {

    private final FibonacciSeries fibonacciSeries = new FibonacciSeries();

//    @Test
//    void shouldCalculateValueIndex1(){
//        final int index = 1;
//        final Long result = fibonacciSeries.compute(index);
//
//        assertThat(result).isEqualTo(1);
//    }
//
//    @Test
//    void shouldCalculateValueIndex5(){
//        final int index = 5;
//        final Long result = fibonacciSeries.compute(index);
//
//        assertThat(result).isEqualTo(5);
//    }
//
//    @Test
//    void shouldCalculateValueIndex15(){
//        final int index = 15;
//        final Long result = fibonacciSeries.compute(index);
//
//        assertThat(result).isEqualTo(610);
//    }


    @ParameterizedTest
    @ArgumentsSource(FibonacciArgumentsProvider.class)
        void shouldCalculateFibanacciSeries (final int index, final long expectetResult){
        final Long result = fibonacciSeries.compute(index);

        assertThat(result).isEqualTo(expectetResult);
    }


    @Test
    void shouldThrowExceptionWhenComputingWithNonPositivIndex(){
        final int incorectIndex = 0;
        final IllegalArgumentException exp = assertThrows(IllegalArgumentException.class, () -> fibonacciSeries.compute(incorectIndex));
        assertThat(exp)
                .hasMessageContaining("has to be positive")
                .extracting(Throwable::getCause)
                .isNull();
                //.hasNoCause();
    }




}