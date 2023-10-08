package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        String[] split = s.split(" ");
        String[] arr = new String[split.length];
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            char c = split[i].charAt(split[i].length() - 1);
            int value = Integer.parseInt(String.valueOf(c));
            arr[value - 1] = split[i];


        }

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        for (String string : list) {
            String removedNumbers = string.substring(0, string.length() - 1);
            text.append(removedNumbers);
            text.append(" ");

        }

        return text.toString().replaceAll("\\s+$", "");
    }
}
