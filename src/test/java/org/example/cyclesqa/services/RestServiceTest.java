package org.example.cyclesqa.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void testRestIncome10_000(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();

//        int income = 10_000;  // заработано за текущий месяц
//        int expenses = 3_000;  // ежемесячные расходы
//        int threshold = 20_000; // мин. сумма,чтобы след. месяц не работать.
//        int expected = 3; // кол-во месяцев отдыха

        int actual = service.calcRest(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

 }

//    @Test
//    public void testRestIncome100_000() {
//        RestService service = new RestService();
//
//        int income = 100_000;  // заработано за текущий месяц
//        int expenses = 60_000;  // ежемесячные расходы
//        int threshold = 150_000; // мин. сумма,чтобы след. месяц не работать.
//        int expected = 2; // кол-во месяцев отдыха
//
//        int actual = service.calcRest(income, expenses, threshold);
//        Assertions.assertEquals(expected, actual);
//
//    }
}