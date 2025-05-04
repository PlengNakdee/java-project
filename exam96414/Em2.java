// 6596008828 Woradanue Nakdee Group 4 
package exam96414;

public class Em2 {
    public static void main(String[] args) {
        int r[] = { 21, 44, 89, 54, 67, 78, 96, 37, 83, 59 };

        for (int i = 0; i < r.length; i++) {
            int result = r[i] % 11;
            if (result == 0) {
                System.out.printf("Number: %d, index: %d, result: %d \n", r[i], i, result);
            }
        }
    }
}
