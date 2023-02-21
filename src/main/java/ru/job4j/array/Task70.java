package ru.job4j.array;

import java.util.StringJoiner;

public class Task70 {
    public static void array(int[] arr) {
        StringJoiner sj1 = new StringJoiner(" ");
        StringJoiner sj2 = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            String str = String.valueOf(arr[i]);
            if (arr.length % 2 == 0) {
                StringJoiner j1 = i < arr.length / 2 ? sj1.add(str) : sj2.add(str);
            } else {
                StringJoiner j2 = i <= arr.length / 2 ? sj1.add(str) : sj2.add(str);
            }
        }
        System.out.println(sj1);
        System.out.println(sj2);
    }

    public static void main(String[] args) {
        int[] ar = {3, 5, 4, 7, 7, 2, 1, 0};
        array(ar);
    }
}
