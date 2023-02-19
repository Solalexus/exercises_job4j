package ru.job4j.condition;

public class Task70 {
    public static void secondsToMinutes(int seconds) {
        System.out.println(seconds / 60 >= 60 && seconds % 60 > 0 ? "Расчет не производится"
                : "Минут: " + seconds / 60 + ", секунд: " + seconds % 60);
    }
}
