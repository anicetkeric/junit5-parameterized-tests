package com.boottechnologies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CostCalculatorTest {


    @Test
    void testTotalCostLessThan20() {

        CostCalculator calculator = new CostCalculator();

        assertEquals(10, calculator.getCostToPaid(10));
    }
    @Test
    void testTotalCostBetween20_35() {

        CostCalculator calculator = new CostCalculator();

        assertEquals(23.75, calculator.getCostToPaid(25));
    }

    @Test
    void testTotalCostBetween35_50() {

        CostCalculator calculator = new CostCalculator();

        assertEquals(37.8, calculator.getCostToPaid(42));
    }

    @Test
    void testTotalCostGreater50() {

        CostCalculator calculator = new CostCalculator();

        assertEquals(59.5, calculator.getCostToPaid(70));
    }

}