package pl.sdacademy.util;

public class PolishPersonUtil {

    private static final int ADULT_AGE = 18;

    public boolean isPolishFemaleName(final String name) {
        return name.length() > 2 && name.endsWith("a");
    }

    public boolean isPolishFemaleAdult(final String name, final int age) {
        return isPolishFemaleName(name) && age >= ADULT_AGE;
    }
}
