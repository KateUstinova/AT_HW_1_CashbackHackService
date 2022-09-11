package ru.netology.service;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldLowBoundaryService() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void shouldHighBoundaryService() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void shouldEqualBoundaryService() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);

    }
}
