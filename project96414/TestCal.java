package project96414;

import java.util.Scanner;

public class TestCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        if (num2 == 0) {
            System.out.print("Cannot divide by 0. ");
            System.out.print("Enter a new second number: ");
            num2 = scanner.nextInt();
            System.out.print("Calculated...\n");
        } else {
            System.out.print("Calculated...\n");
        }

        Calculation cal = new Calculation();

        int add = cal.add(num1, num2);
        int subtract = cal.subtract(num1, num2);
        int multiply = cal.multiply(num1, num2);
        double divide = cal.divide(num1, num2);

        System.out.printf("Add: %d \n", add);
        System.out.printf("Subtract: %d \n", subtract);
        System.out.printf("Multiply: %d \n", multiply);
        System.out.printf("Divide: %,.3f", divide);

        scanner.close();
    }
}
