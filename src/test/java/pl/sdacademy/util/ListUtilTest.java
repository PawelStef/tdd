package pl.sdacademy.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListUtilTest {

    @Test
    void shouldDoubleValues(){
        final List<Integer> valuesToDouble = Arrays.asList(3, 5, 6);

        final List<Integer> doubleValues = ListUtil.doubleInputValue(valuesToDouble);

        assertIterableEquals(Arrays.asList(6,10,8), doubleValues);
        assertNotSame(valuesToDouble, doubleValues);
    }

    @Test
    void shouldDoubleImputValues(){
        final List<Integer> valuesToDouble = Arrays.asList(3, 5, 6);

        final List<Integer> doubleValues = ListUtil.doubleInputValue(valuesToDouble);

        assertIterableEquals(Arrays.asList(6,10,8), doubleValues);
        assertSame(valuesToDouble, doubleValues);
    }

}