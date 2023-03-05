package ru.job4j.array;

import java.util.StringJoiner;

public class Task71 {
    public static void array(int[] arr) {
        StringJoiner sj1 = new StringJoiner(" ");
        StringJoiner sj2 = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            StringJoiner str = i % 2 == 0 ? sj1.add(String.valueOf(arr[i])) : sj2.add(String.valueOf(arr[i]));
        }
        System.out.println(sj1);
        System.out.println(sj2);
    }
}
