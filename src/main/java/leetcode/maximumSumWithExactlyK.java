package leetcode;

import java.util.Arrays;

public class maximumSumWithExactlyK {
    public static void main(String[] args) {
        System.out.println(maximizeSum(new int[]{4, 4, 9, 10, 10, 9, 3, 8, 4, 2, 5, 3, 8, 6, 1, 10, 4, 5, 3, 2, 3, 9, 5, 7, 10, 4, 9, 10, 1, 10, 4}, 6));
        System.out.println();
    }

    public static int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[nums.length - 1];
            nums[nums.length - 1]++;
        }
        return sum;
    }
}
