package ru.netology.stats;

public class StatsService {

    public static long sumSales(int[] salesInMonth) {
        int sumSales = 0;
        for (int sale : salesInMonth) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public static long averageSalesAmount(int[] salesInMonth) {
        long average = sumSales(salesInMonth) / salesInMonth.length;
        return average;
    }

    public static int numMonthMaxSales(int[] salesInMonth) {
        int maxSales = 0;
        for (int month = 1; month < salesInMonth.length; month++)
            if (salesInMonth[month] >= salesInMonth[maxSales]) {
                maxSales = month;
            }
        return maxSales + 1;
    }

    public static int numMonthMinSales(int[] salesInMonth) {
        int minSales = 0;
        for (int month = 1; month < salesInMonth.length; month++)
            if (salesInMonth[month] <= salesInMonth[minSales]) {
                minSales = month;
            }
        return minSales + 1;
    }

    public static int amountMountSalesBelowAverage(int[] salesInMonth) {
        long average = averageSalesAmount(salesInMonth);
        int count = 0;
        for (int sale : salesInMonth) {
            if (sale  < average) {
                count++;
            }
        }
        return count;
    }

    public static int amountMountSalesAboveAverage(int[] salesInMonth) {
        long average = averageSalesAmount(salesInMonth);
        int count = 0;
        for (int sale : salesInMonth) {
            if (sale  > average) {
                count++;
            }
        }
        return count;
    }
}