package ru.job4j.condition;

public class Task71 {
    public static void change(int money) {
        int x = money / 100;
        int y = money % 100 / 50;
        int z = money % 100 % 50 / 10;
        System.out.println(money % 10 == 0 ? "100: " + x + ", 50: " + y + ", 10: " + z : "Нельзя");
    }
}
