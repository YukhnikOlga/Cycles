package org.example.cyclesqa.services;

public class RestService {

    public int calcRest(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        // income - заработано за месяц
        // expenses - ежемесячные расходы
        // threshold - мин. сумма,чтобы след. месяц не работать.

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;


            }
        }
        return count;
    }
}