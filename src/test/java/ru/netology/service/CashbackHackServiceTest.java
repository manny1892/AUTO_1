package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnOneCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected, "TEST 1");
    }

    @Test
    public void shouldReturnZeroCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected, "TEST 2");
    }

    @Test
    public void shouldReturnCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected, "TEST 3");
    }

}