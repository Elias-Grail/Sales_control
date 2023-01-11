package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test

    public void TheSumOfAllSales() {

        StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

                long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
                long actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void TheAverageAmountOfSalesPerMonth() {

        StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

                long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
                long actual = service.aver(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MaxNumber() {

        StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

                long expected = 8;
                long actual = service.maxNumber(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MinNumber() {

        StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

                long expected = 9;
                long actual = service.minNumber(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void BelowAverage() {

        StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

                long expected = 5;
                long actual = service.belowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void AboveAverage() {

        StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

                long expected = 5;
                long actual = service.aboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}