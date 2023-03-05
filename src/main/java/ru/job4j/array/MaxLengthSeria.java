package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int seria = 1;
        int counter = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                counter++;
                if (counter > seria) {
                    seria = counter;
                }
            } else {
                counter = 1;
            }
        }
        return seria;
    }
}
