package leetcode;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.equals("--X") || operation.equals("X--")) {
                --x;
            } else {
                ++x;
            }
        }
        return x;
    }
}
