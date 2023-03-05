package ru.job4j.array;

import java.util.StringJoiner;

public class Task72 {
    public static void array(int[] arr) {
        String ln = System.lineSeparator();
        StringJoiner sj1 = new StringJoiner(" ");
        StringJoiner sj2 = new StringJoiner(" ");
        for (int i : arr) {
            if (i % 2 == 0) {
                sj1.add(String.valueOf(i));
            } else {
                sj2.add(String.valueOf(i));
            }
        }
        if (sj1.toString().isEmpty() || sj2.toString().isEmpty()) {
            System.out.print(sj1);
            System.out.println(sj2);
        } else {
            System.out.println(sj1);
            System.out.println(sj2);
        }
    }

    public static void main(String[] args) {
        int[] ar = {3, 2, 9, 7, 9, 8, 24};
        array(ar);
    }
}
