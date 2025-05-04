// 6596008828 Woradanue Nakdee Group 4
package exam96414;

import java.util.Scanner;

public class Em3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a square size: ");
        double size = scanner.nextDouble();

        Square sq = new Square();
        double sizeResult = sq.calArea(size);
        double perimeterResult = sq.findPerimeter(size);

        sq.showResult(sizeResult, perimeterResult);
        scanner.close();
    }
}
