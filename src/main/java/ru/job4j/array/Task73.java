package ru.job4j.array;

import java.util.StringJoiner;

public class Task73 {
    public static void array(int[] arr) {
        StringJoiner sj1 = new StringJoiner(" ");
        int c = arr.length % 2 != 0 ? arr.length / 2 : (arr.length / 2) - 1;
        for (int i = 0; i <= c; i++) {
            int a = arr[i];
            int b = arr[arr.length - 1 - i];
            if (i == arr.length / 2 && arr.length % 2 != 0) {
                sj1.add(String.valueOf(b));
            } else {
                sj1.add(String.valueOf(a)).add(String.valueOf(b));
            }
            System.out.println(sj1);
            sj1 = new StringJoiner(" ");
        }
    }
}
