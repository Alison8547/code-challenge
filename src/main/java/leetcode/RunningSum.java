package leetcode;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
    }

    public static int[] runningSum(int[] nums) {
        int[] runningArray = new int[nums.length];

        runningArray[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            runningArray[i] = runningArray[i - 1] + nums[i];
        }

        return runningArray;
    }
}
