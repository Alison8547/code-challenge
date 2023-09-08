package leetcode;

public class MaximumWealth {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));


    }

    public static int maximumWealth(int[][] accounts) {
        int maximum = 0;
        int[] array = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                array[i] += accounts[i][j];

                if (array[i] > maximum) {
                    maximum = array[i];
                }
            }
        }
        return maximum;
    }
}
