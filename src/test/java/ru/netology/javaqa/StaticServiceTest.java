package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StaticService;

public class StaticServiceTest {

    @Test
    public void shouldSum() {
        StaticService service = new StaticService();
        int[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sum(salesTest);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAvarageSum() {
        StaticService service = new StaticService();
        int[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.avarageAmount(salesTest);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSales() {
        StaticService service = new StaticService();
        int[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(salesTest);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSales() {
        StaticService service = new StaticService();
        int[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(salesTest);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountUnderAvarageSum() {
        StaticService service = new StaticService();
        int[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.underCount(salesTest);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountOverAvarageSum() {
        StaticService service = new StaticService();
        int[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.overCount(salesTest);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}