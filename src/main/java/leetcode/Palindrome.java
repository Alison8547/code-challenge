package leetcode;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int target) {
        String s = String.valueOf(target);
        String result = new StringBuilder(s).reverse().toString();
        return s.equals(result);
    }
}
