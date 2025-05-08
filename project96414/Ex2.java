package project96414;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 10; i++){
            System.out.printf("Enter %d number: ", i+1);
            // sum = sum + scanner.nextInt();
            sum += scanner.nextInt();
        }
        System.out.printf("The sum is: %d \n", sum);

        double avg = (double)sum / (double)10 ;
        System.out.printf("The average is: %,.3f ", avg);
        scanner.close();
    }
}
