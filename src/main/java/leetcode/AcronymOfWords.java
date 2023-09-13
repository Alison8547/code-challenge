package leetcode;

import java.util.List;

public class AcronymOfWords {
    public static void main(String[] args) {
        System.out.println(isAcronym(List.of("alice", "bob", "charlie"), "abc"));
    }

    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.size(); i++) {
            stringBuilder.append(words.get(i).charAt(0));
        }
        return stringBuilder.toString().equals(s);
    }
}
