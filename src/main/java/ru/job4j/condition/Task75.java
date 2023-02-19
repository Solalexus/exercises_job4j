package ru.job4j.condition;

public class Task75 {
    public static void innerNum(int num2, int num4) {
        int count = 0;
        if (num4 / 100 == num2) {
            count++;
        }
        if (num4 % 1000 / 10 == num2) {
            count++;
        }
        if (num4 % 100 == num2) {
            count++;
        }
        System.out.println(count);
    }
}
