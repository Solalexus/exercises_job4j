package ru.job4j.array;

import java.util.StringJoiner;

public class Task78 {
    public static void array(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        boolean b = true;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    b = false;
                    break;
                }
            }
            if (b) {
                sj.add(String.valueOf(nums[i]));
            }
            b = true;
        }
        if (sj.toString().isEmpty()) {
            System.out.print(sj);
        } else {
            System.out.println(sj);
        }
    }
}
