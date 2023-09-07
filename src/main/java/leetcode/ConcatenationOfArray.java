package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 3})));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] array = new int[nums.length];
        System.arraycopy(nums, 0, array, 0, nums.length);

        return IntStream.concat(Arrays.stream(nums), Arrays.stream(array)).toArray();
    }


}

