package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1})));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            integerList.add(index[i], nums[i]);
        }

        for (int i = 0; i < integerList.size(); i++) {
            target[i] = integerList.get(i);
        }

        return target;
    }
}
