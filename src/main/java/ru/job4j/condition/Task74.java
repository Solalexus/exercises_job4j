package ru.job4j.condition;

public class Task74 {
    public static void innerNum(int num2, int num4) {
        if (num4 / 100 == num2 || num4 % 1000 / 10 == num2 || num4 % 100 == num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
