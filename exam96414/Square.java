// 6596008828 Woradanue Nakdee Group 4 
package exam96414;

public class Square {
    public double calArea(double a) {
        double result;
        result = a * a;
        return result;
    }

    public double findPerimeter(double a) {
        double result;
        result = a * 4;
        return result;
    }

    public void showResult(double a, double b) {
        System.out.printf("Square area is: %,.2f \n", a);
        System.out.printf("Square perimeter is: %,.2f", b);
    }
}
