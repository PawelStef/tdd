package pl.sdacademy.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerUtilsTest2 {

    private IntegerUtils integerUtils = new IntegerUtils();

    @Test
    void zeroShouldBeEven() {

        assertThat(integerUtils.isEven(0)).isTrue();
    }

    @Test
    void fourShouldBeEvent() {
        assertThat(integerUtils.isEven(4)).isTrue();
    }

    @Test
    void bigNumberShouldBeEvent() {
        assertThat(integerUtils.isEven(432311316)).isTrue();
    }

    @Test
    void shouldGetFirstEvenDigit() {
        System.out.println(integerUtils.getLastEvenDigit(12345));
    }
}