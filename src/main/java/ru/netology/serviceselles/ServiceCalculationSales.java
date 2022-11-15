package ru.netology.serviceselles;

public class ServiceCalculationSales {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public double sumSales(long[] sales) {
        double sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + (double) sales[i];
        }
        return sum;
    }

    public double sumMidSales(long[] sales) {
        double sumMothsSales = sumSales(sales);
        double midSum = sumMothsSales / sales.length;
        return midSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int monthDownMidSum(long[] sales) {
        double midSum = sumMidSales(sales);
        int sumMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= midSum) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }

    public int monthUpMidSum(long[] sales) {
        double midSum = sumMidSales(sales);
        int sumMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= midSum) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }
}
