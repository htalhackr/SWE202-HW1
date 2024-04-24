//   B221202370  - Halit Talha Çakır
// SWE 202 SOFTWARE VERIFICATION AND VALIDATION - HOMEWORK 1
// https://github.com/htalhackr/SWE202-HW1
package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"10, 2, 5"})
    void testDivision1(int a, int b, int expected) {
        assertEquals(expected, Calculator.divide(a, b));
    }

    @ParameterizedTest
    @CsvSource({"10, 4, 2.5"})
    void testDivision2(int a, int b, float expected) {
        assertEquals(expected, Calculator.divide(a, b));
    }

    @ParameterizedTest
    @CsvSource({"12.5f, 2.5f, 5"})
    void testDivision3(float a, float b, float expected) {
        assertEquals(expected, Calculator.divide(a, b));
    }

    @ParameterizedTest
    @CsvSource({"10, 2.5f, 4"})
    void testDivision4(float a, float b, float expected) {
        assertEquals(expected, Calculator.divide(a, b));
    }

    @ParameterizedTest
    @CsvSource({"12.5f, 5, 2.5f"})
    void testDivision5(float a, float b, float expected) {
        assertEquals(expected, Calculator.divide(a, b));
    }

    @ParameterizedTest
    @CsvSource({"10, 2, 5", "10, 4, 2.5", "12.5f, 2.5f, 5", "10, 2.5f, 4", "12.5f, 5, 2.5f"})
    void testDivisions(float a, float b, float expected) {
        assertEquals(expected, Calculator.divide(a, b));
    }
    @Test
    void testDivision6() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );

        // Optional. To check whether the error messages match.
        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }
}