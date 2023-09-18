package leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountConsistentStrings {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        char[] charArray = allowed.toCharArray();

        for (char s : charArray) {
            set.add(s);
        }

        for (int i = 0; i < words.length; i++) {
            int counter = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (!(set.contains(words[i].charAt(j)))) {
                    counter++;
                }
            }
            if (counter == 0) {
                ans++;
            }
        }
        return ans;
    }
}
