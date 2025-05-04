// 6596008828 Woradanue Nakdee Group 4 
package exam96414;

import java.util.Scanner;

public class Em1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = scanner.nextInt();

        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        int area = base * height / 2;
        System.out.printf("The triangle area is: %d", area);

        scanner.close();
    }
}
