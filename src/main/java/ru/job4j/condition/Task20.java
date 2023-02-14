package ru.job4j.condition;

public class Task20 {
    public static void numCheck(int number) {
        String result = "Нет";
        if ((number / 100) % 2 + (number / 10 % 10) % 2 + (number % 10) % 2 == 0) {
            result = "Да";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        numCheck(325);
    }
}
