package leetcode;

public class ArithmeticTriplets {
    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[]{4,5,6,7,8,9}, 2));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        count++;
                    }
                }
            }
        }

        return count ;
    }
}
