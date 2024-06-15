package fizz_buzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private String result;

    @BeforeEach
    void setUp() {
        result = null;
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    @DisplayName("Fizz numbers")
    void testFizz(int number) {
        result = FizzBuzz.fizzBuzz(number);
        assertEquals("Fizz", result, getMessage(number, result, "Fizz"));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 15, 20})
    @DisplayName("Buzz numbers")
    void testBuzz(int number) {
        result = FizzBuzz.fizzBuzz(number);
        assertEquals("Buzz", result,getMessage(number, result, "Buzz"));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60})
    @DisplayName("FizzBuzz numbers")
    void testFizzBuzz(int number) {
        result = FizzBuzz.fizzBuzz(number);
        assertEquals("FizzBuzz", result,getMessage(number, result, "FizzBuzz"));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 17, 47, 88})
    @DisplayName("Other numbers")
    void testOther(int number) {
        result = FizzBuzz.fizzBuzz(number);
        String expected = String.valueOf(number);
        assertEquals(expected, result,getMessage(number, result, expected));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, 101})
    @DisplayName("Out of range numbers")
    void testOutOfRange(int number) {
        result = FizzBuzz.fizzBuzz(number);
        String expected = "Out of range";
        assertEquals(expected, result,getMessage(number, result, expected));
    }

    private static String getMessage(int number, String result, String expected) {
        return "Expected "+ expected +" for " + number + " but got " + result;
    }
}