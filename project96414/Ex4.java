package project96414;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 0 to 100: ");
        int point = scanner.nextInt();
        System.out.println(".....");

        if (point < 0 || point > 100) {
            System.out.print("Number not in range. \n");
            System.out.print("Enter number from 0 to 100: ");
            point = scanner.nextInt();
        } else {
            System.out.println(".....");
        }

        if (point < 50) {
            System.out.print("Grade F");
        } else if (point >= 50 && point <= 59) {
            System.out.print("Grade E");
        } else if (point >= 60 && point <= 69) {
            System.out.print("Grade D");
        } else if (point >= 70 && point <= 79) {
            System.out.print("Grade C");
        } else if (point >= 80 && point <= 89) {
            System.out.print("Grade B");
        } else {
            System.out.print("Grade A");
        }

        scanner.close();
    }
}
