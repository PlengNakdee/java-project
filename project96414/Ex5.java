package project96414;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[] = new int[5];
        int num;
        for (int i=0; i<a.length; i++){
            System.out.printf("Enter %d number: ", i+1);
            num = scanner.nextInt();
            a[i] = num;
        }
        int max = a[0];
        int min = a[0];

        for (int i=0; i<a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.printf("Max number %d: \n", max);
        System.out.printf("Min number %d: ", min);
        
        scanner.close();
    }
}
