package com.boottechnologies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CostCalculatorValueSourceTest {

    @ParameterizedTest
    @ValueSource(doubles = {10.0, 25.0, 42.0, 70.0})
    void testTotalCost(double input) {
        Map<Double, Double> expectedResult = new HashMap<>();
        expectedResult.put(10.0, 10.0);
        expectedResult.put(25.0, 23.75);
        expectedResult.put(42.0, 37.8);
        expectedResult.put(70.0, 59.5);

        CostCalculator calculator = new CostCalculator();
        assertEquals(expectedResult.get(input), calculator.getCostToPaid(input));
    }
}