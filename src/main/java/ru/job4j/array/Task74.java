package ru.job4j.array;

import java.util.StringJoiner;

public class Task74 {
    public static void array(int[] arr) {
        StringJoiner st1 = new StringJoiner(" ");
        StringJoiner st2 = new StringJoiner(" ");
        int runtime = arr.length / 2;
        for (int i = 0; i < runtime; i++) {
            int count = arr[i];
            int countdown = arr[arr.length - 1 - i];
            st1.add(String.valueOf(count));
            st2.add(String.valueOf(countdown));
            }
        if (arr.length % 2 != 0) {
            st2.add(String.valueOf(arr[runtime]));
        }
        System.out.println(st1);
        System.out.println(st2);
    }
}
