package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i < 5) {
                salary = hours[i] < 9 ? salary + hours[i] * 10 : salary + 8 * 10 + (hours[i] - 8) * 15;
            } else {
                salary = hours[i] < 9 ? salary + hours[i] * 20 : salary + 8 * 20 + (hours[i] - 8) * 30;
            }
        }
        return salary;
    }
}
