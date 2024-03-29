package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations {
    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] strArr = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
                "-..-", "-.--", "--.."};

        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();

            for (char c : word.toCharArray()) {
                sb.append(strArr[c - 'a']);
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}
