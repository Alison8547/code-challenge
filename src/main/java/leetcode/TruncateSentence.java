package leetcode;

public class TruncateSentence {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }

    public static String truncateSentence(String s, int k) {
        String[] split = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            if (i < k) {
                if (i != k - 1) {
                    ans.append(split[i]).append(" ");
                } else {
                    ans.append(split[i]);
                }

            }

        }

        return ans.toString();
    }
}
