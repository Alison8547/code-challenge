package leetcode;

public class ShuffleString {
    public static void main(String[] args) {
        System.out.println((restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3})));
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.setCharAt(indices[i], s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
