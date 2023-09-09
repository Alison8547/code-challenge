package leetcode;

public class MostWordsFound {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }

    public static int mostWordsFound(String[] sentences) {
        int maximum = 0;

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].split(" ").length > maximum) {
                maximum = sentences[i].split(" ").length;
            }
        }
        return maximum;
    }
}
