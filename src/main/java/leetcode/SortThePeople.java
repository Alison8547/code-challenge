package leetcode;

import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPeople(new String[]{"Alice", "Bob", "Bob"}, new int[]{155, 185, 150})));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();


        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        List<String> stringList = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .map(Map.Entry::getValue)
                .toList();

        return stringList.toArray(new String[0]);

    }
}
