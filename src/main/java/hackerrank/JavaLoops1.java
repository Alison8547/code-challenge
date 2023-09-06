package hackerrank;

import java.util.Scanner;

public class JavaLoops1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, (number * i));
        }
    }
}
