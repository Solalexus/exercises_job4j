package ru.job4j.condition;

public class Task73 {
    public static void midDigitLess(int num) {
        if (num % 100 / 10 < num / 100 && num % 100 / 10 < num % 10) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
