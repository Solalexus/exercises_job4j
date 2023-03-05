package ru.job4j.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        for (int j = 3; j < data.length; j++) {
            if (data[j] != data[j - 1] + data[j - 2]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
