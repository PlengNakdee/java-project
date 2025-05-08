package project96414;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int add = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        double divide = (double)num1 / (double)num2;

        System.out.printf("Add: %d. \n", add);
        System.out.printf("Subtract: %d. \n", subtract);
        System.out.printf("Multiply: %d. \n", multiply);
        System.out.printf("Divide: %,.3f.", divide);

        scanner.close();
    }
}
