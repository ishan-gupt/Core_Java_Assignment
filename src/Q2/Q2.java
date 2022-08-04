package Q2;

import java.util.Scanner;

class Number {
    private double number;

    Number(double n) {
        number = n;
    }

    boolean isZero() {
        if (number == 0)
            return true;
        return false;
    }

    boolean isPositive() {
        if (number > 0)
            return true;
        return false;
    }

    boolean isNegative() {
        if (number < 0)
            return true;
        return false;
    }

    boolean isOdd() {
        if (number % 2 != 0)
            return true;
        return false;
    }

    boolean isEven() {
        if (number % 2 == 0)
            return true;
        return false;
    }

    boolean isPrime() {
        if (number == 1 && number == 2) {
            return true;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return false;
    }

    boolean isArmstrong() {
        double sum = 0;
        double x = number;
        while (x > 0) {
            double r = x % 10;
            sum = sum + (r * r * r);
            x = x / 10;
        }
        if (sum == number)
            return true;

        return false;
    }

    double getFactorial() {
        double fact = 1;
        for (int i = 1; i < number + 1; i++) {
            fact = fact * i;
        }
        return fact;
    }

    double getSqrt() {
        return Math.sqrt(number);
    }

    double sumDigits() {
        double sum = 0;
        double x = number;
        while (x > 0) {
            double r = x % 10;
            sum = sum + r;
            x = x / 10;
        }
        return sum;
    }

    double getReverse() {
        double reverse = 0;
        double x = number;
        while (x > 0) {
            double r = x % 10;
            reverse = reverse * 10 + r;
            x = x / 10;
        }
        return reverse;
    }

    void ListFactor() {
        System.out.println("Number Factors: ");
        for (int i = 1; i < number; i++) {
            if (i % number == 0) {
                System.out.print(i + "");
            }
        }
    }

    void DisplayBinary() {
        System.out.println("Binary Number: ");
        double x = number;
        while (x > 0) {
            double r = x % 2;
            System.out.print(r);
            x = x / 2;
        }

    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        Number n = new Number(num);
        System.out.println("Number isZero: " + n.isZero());
        System.out.println("Number isPositive: " + n.isPositive());
        System.out.println("Number isNegative: " + n.isNegative());
        System.out.println("Number isOdd: " + n.isOdd());
        System.out.println("Number isEven: " + n.isEven());
        System.out.println("Number isPrime: " + n.isPrime());
        System.out.println("Number isArmstrong: " + n.isArmstrong());
        System.out.println("Number Factorial: " + n.getFactorial());
        System.out.println("Number Square Root: " + n.getSqrt());
        System.out.println("Number Sum of Digits: " + n.sumDigits());
        System.out.println("Number Reversed: " + n.getReverse());
        n.ListFactor();
        n.DisplayBinary();
        sc.close();
    }
}
