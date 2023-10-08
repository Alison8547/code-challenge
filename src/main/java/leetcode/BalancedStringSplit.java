package leetcode;

public class BalancedStringSplit {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }

    public static int balancedStringSplit(String s) {
        int counter = 0;
        int counterR = 0;
        int counterL = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                counterR++;
            } else {
                counterL++;
            }

            if (counterR == counterL) {
                counter++;
            }
        }

        return counter;
    }
}
