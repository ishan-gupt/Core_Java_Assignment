package Q8;

import java.util.ArrayList;
import java.util.List;

class House {
    System.out.println("This is House");
}

class Parents extends House {
    System.out.println("This is Parents");
}

class Children extends Parents {
    System.out.println("This is Children");
}
public class Q8 {
    public static void ParentsAndDerivatives(List<? extends Parents> l1) {
        System.out.println(l1);
    }

    public static void ParentsAndInverses(List<? super Parents> l1) {
        System.out.println(l1);
    }

    public static void main(String[] args) {
        List<Children> l1 = new ArrayList<>();
        List<House> l2 = new ArrayList<>();

        l1.add(new Children());
        l1.add(new Children());

        ParentsAndDerivatives(l1);//no error
        ParentsAndInverses(l1); //error

        l2.add(new House());
        l2.add(new House());

        ParentsAndInverses(l2);//no error
        ParentsAndDerivatives(l2);//error
    }
}
