import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter second number: ");
        double n2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter operator: ");
        String operation = scanner.nextLine();

        if(operation.equals("sum")) {
            System.out.printf("%f + %f = %f", n1, n2, n1 + n2);
        } else {
            System.out.printf("%s is not a supported operation.", operation);
        }

        scanner.close();
    }
    
}

