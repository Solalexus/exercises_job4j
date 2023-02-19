package ru.job4j.condition;

public class Task72 {
    public static void midDigitMore(int num) {
        if (num % 100 / 10 > num / 100 && num % 100 / 10 > num % 10) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
