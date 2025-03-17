package ru.netology.stats;

public class StatsService {

    public long sumSales(long [] salesInMonth) {
        long sumSales = 0;
        for (long sale : salesInMonth) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public long averageSalesAmount(long[] salesInMonth) {
        long average = sumSales(salesInMonth) / salesInMonth.length;
        return average;
    }

    public int numMonthMaxSales(long[] salesInMonth) {
        int maxSales = 0;
        for (int month = 1; month < salesInMonth.length; month++)
            if (salesInMonth[month] >= salesInMonth[maxSales]) {
                maxSales = month;
            }
        return maxSales + 1;
    }

    public int numMonthMinSales(long[] salesInMonth) {
        int minSales = 0;
        for (int month = 1; month < salesInMonth.length; month++)
            if (salesInMonth[month] <= salesInMonth[minSales]) {
                minSales = month;
            }
        return minSales + 1;
    }

    public int amountMountSalesBelowAverage(long[] salesInMonth) {
        long average = averageSalesAmount(salesInMonth);
        int count = 0;
        for (long sale : salesInMonth) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int amountMountSalesAboveAverage(long[] salesInMonth) {
        long average = averageSalesAmount(salesInMonth);
        int count = 0;
        for (long sale : salesInMonth) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}