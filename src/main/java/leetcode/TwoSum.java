package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}

