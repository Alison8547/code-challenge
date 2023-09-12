package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountMatches {
    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        List<String> stringList1 = new ArrayList<>(List.of("phone", "blue", "pixel"));
        List<String> stringList2 = new ArrayList<>(List.of("computer", "silver", "lenovo"));
        List<String> stringList3 = new ArrayList<>(List.of("phone", "gold", "iphone"));
        lists.add(stringList1);
        lists.add(stringList2);
        lists.add(stringList3);
        System.out.println(countMatches(lists, "color", "silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                count++;
            }

        }
        return count;
    }
}
