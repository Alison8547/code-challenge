package leetcode;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int counter = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                   counter++;
                }


            }

            array[i] = counter;
        }

        return array;
    }
}
