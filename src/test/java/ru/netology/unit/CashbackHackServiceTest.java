package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

@Test
public void shouldRemain1() {
    CashbackHackService service = new CashbackHackService();
    int amount = 900;

    int actual = service.remain(amount);
    int expected = 100;

    assertEquals(actual, expected);
}
    @Test
    public  void shouldRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldRemain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}