package com.boottechnologies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CostCalculatorEnumSourceTest {

    @ParameterizedTest
    @EnumSource(TestCostPaid.class)
    void testTotalCost2(TestCostPaid testCostPaid) {
        CostCalculator calculator = new CostCalculator();
        assertEquals(testCostPaid.getExpected(), calculator.getCostToPaid(testCostPaid.getInput()));
    }
}



enum TestCostPaid {
    TEST_10(10, 10),
    TEST_25(25, 23.75),
    TEST_42(42, 37.8),
    TEST_70(70, 59.5);

    private final double input;
    private final double expected;

    TestCostPaid(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    public double getInput() {
        return input;
    }

    public double getExpected() {
        return expected;
    }
}