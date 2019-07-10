package pl.sdacademy.cwiczenie5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Month;
import java.util.stream.Stream;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class MonthsTest {

    @ParameterizedTest
    @MethodSource("getTestArgs")
    void shouldHave31Days(final Month month) {

        final boolean is31daysMoth = Months.has31days(month);

        assertThat(is31daysMoth).isTrue();
    }

    @ParameterizedTest
    @EnumSource(value =Month.class,names= {"FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void shouldNotHave31Days (final Month month){
        final boolean has31days = Months.has31days(month);

        assertThat(has31days).isFalse();
    }

    @ParameterizedTest
    @EnumSource(value =Month.class,names= {"FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"},mode = EnumSource.Mode.EXCLUDE)
    void shouldHave31Daysv2 (final Month month){

        final boolean has31daysV2 = Months.has31days(month);

        assertThat(has31daysV2).isTrue();
    }


    static Stream<Arguments> getTestArgs() {
        return Stream.of(
                Arguments.of(Month.JANUARY),
                Arguments.of(Month.MARCH),
                Arguments.of(Month.JULY)
        );
    }
}