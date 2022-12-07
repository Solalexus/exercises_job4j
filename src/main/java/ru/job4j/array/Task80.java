package ru.job4j.array;
import java.util.Arrays;

public class Task80 {
    public static int[] array(int[] arr) {
        int f = 0;
        int[] contain = new int[arr.length];
        int b = 0;
        int d = 0;
        for (int ind = 0; ind < arr.length; ind++) {
            for (int i = 0; i < arr.length; i++) {
                if (ind == i) {
                    continue;
                }
                if (arr[ind] == arr[i]) {
                    d = arr[i];
                }
            }
            if (arr[ind] != d) {
                contain[b] = ind;
                b++;
                f++;
            }
        }
        return Arrays.copyOf(contain, f);
    }
}


