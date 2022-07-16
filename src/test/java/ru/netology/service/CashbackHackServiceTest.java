package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnOneCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnZeroCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnOneCashbackJupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnZeroCashbackJupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnCashbackJupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(expected,actual);
    }



}