package ru.job4j.array;

public class Task80 {
    public static int[] array(int[] arr) {
        int f = 1;
        int[] contain = new int[f];
        int a = 1;
        for (int i = a; i < arr.length; i++) {
            for (int nums : arr) {
                if (nums == arr[i]) {
                    continue;
                } else if (nums != arr[i]) {
                    f++;
                    a++;
                }
            }
        }
        return contain;
    }
}
