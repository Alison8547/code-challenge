package hackerrank;

import java.util.Scanner;

public class JavaStdinStdout1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        System.out.printf("%d%n%d%n%d%n", number1, number2, number3);
    }
}
