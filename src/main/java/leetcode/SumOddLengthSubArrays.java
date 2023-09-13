package leetcode;

public class SumOddLengthSubArrays {
    public static void main(String[] args) {
        System.out.println(sumOddLengthSubArrays(new int[]{1, 4, 2, 5, 3}));
        System.out.println(sumOddLengthSubArrays(new int[]{10, 11, 12}));
    }

    public static int sumOddLengthSubArrays(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j <= arr.length; j += 2) {
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                }

            }
        }

        return sum;
    }
}
