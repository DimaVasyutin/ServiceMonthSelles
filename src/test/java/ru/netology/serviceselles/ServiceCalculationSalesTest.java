package ru.netology.serviceselles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceCalculationSalesTest {
    @Test
    public void findMinSales() {
        ServiceCalculationSales serviceSumSales = new ServiceCalculationSales();
        long[] sales = {10, 20, 30, 20, 44, 5};
        int expected = 6;
        int minMonth = serviceSumSales.minSales(sales);
        Assertions.assertEquals(expected, minMonth);

    }

    @Test
    public void findMaxSales() {
        ServiceCalculationSales serviceSumSales = new ServiceCalculationSales();
        long[] sales = {10, 20, 30, 20, 44, 5};
        int expected = 5;
        int maxMonth = serviceSumSales.maxSales(sales);
        Assertions.assertEquals(expected, maxMonth);

    }

    @Test
    public void findSumSales() {
        ServiceCalculationSales serviceSumSales = new ServiceCalculationSales();
        long[] sales = {10, 20, 30, 20, 44, 5};
        double expected = 129;
        double sumMothsSales = serviceSumSales.sumSales(sales);
        Assertions.assertEquals(expected, sumMothsSales);

    }

    @Test
    public void findSumMidSales() {
        ServiceCalculationSales serviceSumSales = new ServiceCalculationSales();
        long[] sales = {10, 20, 30, 20, 44, 5};
        double expected = 21.5;
        double midSum = serviceSumSales.sumMidSales(sales);
        Assertions.assertEquals(expected, midSum);

    }

    @Test
    public void findMonthDownMidSum() {
        ServiceCalculationSales serviceSumSales = new ServiceCalculationSales();
        long[] sales = {10, 20, 30, 20, 44, 5};
        int expected = 4;
        int sumDownMidMonth = serviceSumSales.monthDownMidSum(sales);
        Assertions.assertEquals(expected, sumDownMidMonth);

    }

    @Test
    public void findMonthUpMidSum() {
        ServiceCalculationSales serviceSumSales = new ServiceCalculationSales();
        long[] sales = {10, 20, 30, 20, 44, 5};
        int expected = 2;
        int sumUpMidMonth = serviceSumSales.monthUpMidSum(sales);
        Assertions.assertEquals(expected, sumUpMidMonth);

    }


}
