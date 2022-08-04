package Q1;

import java.util.Scanner;

class Box {
    int length;
    int breadth;
    int height;

    Box() {
        length = 0;
        breadth = 0;
        height = 0;
    }
}

class Box3d extends Box {
    Box3d(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    int area() {
        return length * breadth;
    }

    int volume() {

        return length * breadth * height;
    }
}
class Q1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        int height = scanner.nextInt();
        Box3d b = new Box3d(length, breadth, height);
        System.out.println("Area is " + b.area());
        System.out.println("volume is " + b.volume());
        scanner.close();
    }
}
