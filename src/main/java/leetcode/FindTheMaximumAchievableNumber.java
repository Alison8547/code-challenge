package leetcode;

public class FindTheMaximumAchievableNumber {
    public static void main(String[] args) {
        System.out.println(theMaximumAchievableX(4,1));
    }

    public static int theMaximumAchievableX(int num, int t) {
        return num + (t * 2);
    }
}
