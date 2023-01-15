package ru.netology.stats;

public class StatsService {
    public long sum(long[] massive) {

        long result = 0;
        for (long sale : massive) {
            result += sale;
        }

        return result;
    }

    public long aver(long[] massive) {
        return sum(massive) / massive.length;
    }

    public int maxNumber(long[] massive) {

        long maxSale = massive[0];
        int maxMonth = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] >= maxSale) {
                maxSale = massive[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minNumber(long[] massive) {

        long minSale = massive[0];
        int minMonth = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] <= minSale) {
                minSale = massive[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long belowAverage(long[] massive) {

        int counter = 0;

        for (long sale : massive) {
            if (sale < aver(massive)) {
                counter++;
            }
        }

        return counter;
    }

    public long aboveAverage(long[] massive) {

        int counter = 0;

        for (long sale : massive) {
            if (sale > aver(massive)) {
                counter++;
            }
        }

        return counter;
    }

}
