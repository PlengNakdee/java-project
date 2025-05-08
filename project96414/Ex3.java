package project96414;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int i = 0;

        System.out.print("Loop until enter negative number\n");

        do {
            System.out.print("Enter number: ");
            input = scanner.nextInt();
            i = input;
        } while (i >= 0);

        scanner.close();
    }
}
