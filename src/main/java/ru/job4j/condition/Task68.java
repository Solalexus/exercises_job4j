package ru.job4j.condition;

public class Task68 {
    public static void isTriangle(int a, int b, int c) {
        System.out.println(a < b + c && b < a + c && c < a + b ? "Да" : "Нет");
    }
}
