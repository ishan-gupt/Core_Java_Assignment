package Q10;

import java.util.Scanner;

class Threads {
    // Starting counter
    int counter = 1;

    // Function to print odd numbers
    public void printOddNumber(int N) {
        synchronized (this) {
            // Print number till the N
            while (counter < N) {

                // If count is even then print
                while (counter % 2 == 0) {

                    // Exception handle
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.println("T1 " + counter + " ");

                // Increment counter
                counter++;

                // Notify to second thread
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber(int N) {
        synchronized (this) {
            // Print number till the N
            while (counter < N) {

                // If count is odd then print
                while (counter % 2 == 1) {

                    // Exception handle
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.println("T2 " + counter + " ");

                // Increment counter
                counter++;

                // Notify to 2nd thread
                notify();
            }
        }
    }

}

public class Q10 {

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Given Number N
        System.out.println("Enter the number");
        int N = sc.nextInt();

        // Create an object of class
        Threads mt = new Threads();

        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                mt.printEvenNumber(N);
            }
        });

        // Create thread t2

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                mt.printOddNumber(N);
            }
        });

        // Start both threads
        t1.start();
        t2.start();
    }

}