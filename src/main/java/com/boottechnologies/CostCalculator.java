package com.boottechnologies;

public class CostCalculator {

    public double getCostToPaid(double total) {

        if (total < 20) {
            return total;
        }

        if (total > 20 && total <= 35) {
            return total - (total * 5) / 100;
        }

        if (total > 35 && total <= 50) {
            return total - (total * 10) / 100;
        }

        return total - (total * 15) / 100;

    }

}
