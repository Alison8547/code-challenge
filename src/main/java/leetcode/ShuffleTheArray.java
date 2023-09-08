package leetcode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{1, 1, 2, 2}, 2)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] array = new int[n * 2];
        int x = n;

        for (int i = 0; i < x; i++) {
            array[i + i] = nums[i];
            array[i + i + 1] = nums[n++];
        }
        return array;
    }
}
