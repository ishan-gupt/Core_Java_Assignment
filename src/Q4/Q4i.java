package Q4;

import java.util.Scanner;

public class Q4i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Max = " + findMaxRec(arr, n));
        sc.close();
    }

    public static int findMaxRec(int A[], int n) {
        if (n == 1)
            return A[0];

        return Math.max(A[n - 1], findMaxRec(A, n - 1));
    }

}
