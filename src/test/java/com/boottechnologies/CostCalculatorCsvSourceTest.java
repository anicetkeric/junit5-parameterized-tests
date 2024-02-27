package com.boottechnologies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CostCalculatorCsvSourceTest {


    @ParameterizedTest
    @CsvSource({
            "10, 10",
            "25, 23.75",
            "42, 37.8",
            "70, 59.5",
    })
    void testTotalCost(double input, double expectedResult) {
        CostCalculator calculator = new CostCalculator();
        assertEquals(expectedResult, calculator.getCostToPaid(input));
    }

    // works with java 17
    @ParameterizedTest
    @CsvSource(delimiter = '|', quoteCharacter = '"', textBlock = """
    #-----------------------------
    #    10     |     10
    #-----------------------------
         25     |      23.75
    #-----------------------------
         42     |      37.8
    #-----------------------------
         70     |     59.5
    #-----------------------------
          150   |    127.5
    #-----------------------------
    """)
    void testTotalCost2(double input, double expectedResult) {
        CostCalculator calculator = new CostCalculator();
        assertEquals(expectedResult, calculator.getCostToPaid(input));
    }


}