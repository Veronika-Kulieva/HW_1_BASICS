package ru.netology.service;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() { // протестировали граничное значение 1000
        CashbackHackService service = new CashbackHackService();
        int amount = 1000; // приобретаем на 1000 рублей
        int actual = service.remain(amount); // от метода remain получаем сумму на которую нужно докупить
        int expected = 0; // при сумме 0 ожидаем, что докупать не надо
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashback() { // протестировали сумму меньше 1000
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testWhenAmountMore1000() { // протестировали сумму больше 1000
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testWhenAmount0() { // протестировали сумму когда она равна 0
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}