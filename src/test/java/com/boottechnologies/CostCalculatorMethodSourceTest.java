package com.boottechnologies;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CostCalculatorMethodSourceTest {

    @DisplayName("A parameterized test with arguments")
    @ParameterizedTest(name = "{index} ==> TOTAL COST: {0} - COST TO PAID: {1}")
    @MethodSource("inputsAndResults")
    void testTotalCost(double input, double expectedResult) {
        CostCalculator calculator = new CostCalculator();
        assertEquals(expectedResult, calculator.getCostToPaid(input));
    }
    static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(10, 10),
                Arguments.of(25, 23.75),
                Arguments.of(42, 37.8),
                Arguments.of(70, 59.5),
                Arguments.of(150, 127.5)

        );
    }

}