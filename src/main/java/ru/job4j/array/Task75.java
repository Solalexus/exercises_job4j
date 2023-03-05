package ru.job4j.array;

import java.util.StringJoiner;

public class Task75 {
    public static void array(int[] arr) {
        StringJoiner sj = new StringJoiner("");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] helper = new int[9];
        int i = 0;
        int counter = 0;
        for (int num = 0; num < numbers.length; num++) {
            for (int num1 : arr) {
                if (num1 == numbers[num]) {
                    counter++;
                }
            }
            helper[i] = counter;
            if (num < numbers.length - 1) {
                sj.add(String.valueOf(numbers[num])).add(": ").add(String.valueOf(counter)).add(", ");
            } else {
                sj.add(String.valueOf(numbers[num])).add(": ").add(String.valueOf(counter));
            }
            counter = 0;
            i++;
        }
        System.out.println(sj);
        if (arr.length < 3) {
            System.out.println("Чаще: " + 0 + "," + " отсутствует: " + missing(helper)
                    + "," + " реже: " + 0);
        } else {
            System.out.println("Чаще: " + frequent(helper) + "," + " отсутствует: " + missing(helper)
                    + "," + " реже: " + rare(helper));
        }
    }

    static int maxNum(int[] ar) {
        int max = ar[0];
        for (int i : ar) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static int minNum(int[] ar) {
        int min = ar[maxNum(ar)];
        for (int i : ar) {
            if (i < min && i != 0) {
                min = i;
            }
        }
        return min;
    }

    static StringJoiner frequent(int[] array) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < array.length; i++) {
            if ((maxNum(array) != 0 && maxNum(array) != 1) && maxNum(array) == array[i]) {
                sj.add(String.valueOf(i + 1));
            }
        }
        return sj;
    }

    static StringJoiner missing(int[] array) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                sj.add(String.valueOf(i + 1));
            }
        }
        return sj;
    }

     static StringJoiner rare(int[] array) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < array.length; i++) {
            if (minNum(array) != 0 && minNum(array) == array[i]) {
                sj.add(String.valueOf(i + 1));
            }
        }
        return sj;
    }
}
