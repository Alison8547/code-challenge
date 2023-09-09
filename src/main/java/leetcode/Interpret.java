package leetcode;

public class Interpret {
    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command){
        String replace1 = command.replace("()", "o");
        return replace1.replace("(al)", "al");
    }
}
