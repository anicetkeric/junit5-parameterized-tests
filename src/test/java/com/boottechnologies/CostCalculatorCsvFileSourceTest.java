package com.boottechnologies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CostCalculatorCsvFileSourceTest {

    @ParameterizedTest(name = "{index} ==> TOTAL COST: {0} - COST TO PAID: {1}")
    @CsvFileSource(resources = "/cost-column.csv", numLinesToSkip = 1)
    void testTotalCost3(double input, double expectedResult) {
        CostCalculator calculator = new CostCalculator();
        assertEquals(expectedResult, calculator.getCostToPaid(input));
    }

}