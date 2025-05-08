// 6596008828 Woradanue Nakdee Group 4 
package project96414;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        System.out.printf("Hello World, %s.", name);

        scanner.close();
    }
}
