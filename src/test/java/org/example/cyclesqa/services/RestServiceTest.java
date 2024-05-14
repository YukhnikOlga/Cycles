package org.example.cyclesqa.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {

    @Test
    public void testRestIncome10_000() {
        RestService service = new RestService();

        int income = 10_000;  // заработано за текущий месяц
        int expenses = 3_000;  // ежемесячные расходы
        int threshold = 20_000; // мин. сумма,чтобы след. месяц не работать.
        int expected = 3; // кол-во месяцев отдыха

        int actual = service.calcRest(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testRestIncome100_000() {
        RestService service = new RestService();

        int income = 100_000;  // заработано за текущий месяц
        int expenses = 60_000;  // ежемесячные расходы
        int threshold = 150_000; // мин. сумма,чтобы след. месяц не работать.
        int expected = 2; // кол-во месяцев отдыха

        int actual = service.calcRest(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}