package ru.job4j.array;

public class Task82 {
    public static int[] array(int[] nums) {
        int[] rsl = new int[3];
        for (int i : nums) {
            if (i > 0) {
                rsl[0] = rsl[0] + i;
            } else if (i < 0) {
                rsl[1] = rsl[1] + i;
            } else {
                rsl[2]++;
            }
        }
        return rsl;
    }
}
