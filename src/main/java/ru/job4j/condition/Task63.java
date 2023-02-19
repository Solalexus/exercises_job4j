package ru.job4j.condition;

public class Task63 {
    public static void isDecreasing(int number) {
        String rsl = "Да";
        while (number / 10 > 0) {
            if (number % 10 > number / 10 % 10) {
                rsl = "Нет";
            }
            number /= 10;
        }
        System.out.println(rsl);
    }
}
