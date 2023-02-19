package ru.job4j.array;

import java.util.StringJoiner;

public class Task79 {
    public static void array(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j] && !sj.toString().contains(String.valueOf(nums[i]))) {
                    sj.add(String.valueOf(nums[i]));
                }
            }
        }
        if (sj.toString().isEmpty()) {
            System.out.print(sj);
        } else {
            System.out.println(sj);
        }
    }
}
