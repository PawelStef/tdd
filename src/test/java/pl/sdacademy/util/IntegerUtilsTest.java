package pl.sdacademy.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IntegerUtilsTest {

    private IntegerUtils integerUtils;

    @BeforeEach
    void setUp() {
        integerUtils = new IntegerUtils();
    }

    @Test
    void shouldFilterNumberWithFilters() {
        final int toFilter = 12345;
        final List<Integer> filters = Arrays.asList(2, 4);

        final List<Integer> filtered = integerUtils.filter(toFilter, filters);
        assertAll(
                () -> assertFalse(filtered.isEmpty()),
                () -> assertEquals(3, filtered.size()),
                () -> assertTrue(filtered.contains(1)),
                () -> assertTrue(filtered.contains(3)),
                () -> assertTrue(filtered.contains(5))
        );
    }

    @Test
    void shouldFilterDigitsGreaterThanWhenFilterApply(){
        final int toFilter = 12435;
        final int filter =3;

        final List<Integer> filterValue =integerUtils.filterDigitsGreaterThan(toFilter, filter);

        assertThat(filterValue).isNotEmpty()
                .hasSize(2)
                .contains(4,5);
    }

    @Test
    void shouldGiveLastEvenDigit(){
        final int toFilter =1245677;

        final Optional<Integer> result = integerUtils.getLastEvenDigit(toFilter);

        assertThat(result).isPresent()
                .contains(6);
    }

    @Test
    void shouldGiveEmptyOptional(){
        final int toFilter =13579;

        final Optional<Integer> result = integerUtils.getLastEvenDigit(toFilter);

        assertThat(result).isNotPresent();

    }

}