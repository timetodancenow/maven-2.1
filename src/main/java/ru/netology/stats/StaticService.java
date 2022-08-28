package ru.netology.stats;

public class StaticService {

    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int avarageAmount(int[] sales) {
        int sum = sum(sales);
        return sum / 12;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int underCount(int[] sales) {
        int avarage = avarageAmount(sales);
        int underCount = 0;
        for (int sale : sales) {
            if (sale < avarage) {
                underCount++;
            }
        }
        return underCount;
    }

    public int overCount(int[] sales) {
        int avarage = avarageAmount(sales);
        int overCount = 0;
        for (int sale : sales) {
            if (sale > avarage) {
                overCount++;
            }
        }
        return overCount;
    }
}