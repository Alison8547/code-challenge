package leetcode;

public class DifferenceOfSum {
    public static void main(String[] args) {
        System.out.println(differenceOfSum(new int[]{1, 15, 6, 3}));
    }

    public static int differenceOfSum(int[] nums) {
        StringBuilder sb = new StringBuilder();
        int elementSum = 0;
        int digitSum = 0;

        for (int num : nums) {
            elementSum += num;
            sb.append(num);
        }

        String[] split = sb.toString().split("");

        for (String s : split) {
            digitSum += Integer.parseInt(s);
        }
        return elementSum - digitSum;
    }
}