package Q4;

import java.util.Scanner;

public class Q4ii {
    static int n1 = 0;
    static int n2 = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n == 1) {
            System.out.println(n1 + " ");
        }
        if (n == 2) {
            System.out.println(n1 + " " + n2 + " ");
        } else {
            System.out.print(n1 + " " + n2 + " ");
            FibonacciNumber(n - 2);
        }





    }

    static void FibonacciNumber(int n) {
        if (n > 0) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            FibonacciNumber(n - 1);
        }
    }
}