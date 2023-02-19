package ru.job4j.condition;

public class Task64 {
    public static void gradePrint(int number) {
        String value = switch (number) {
            case 1, 2 -> "Плохо";
            case 3 -> "Удовлетворительно";
            case 4 -> "Хорошо";
            case 5 -> "Отлично";
            default -> "Не соответствует";
        };
        System.out.println(value);
    }
}
