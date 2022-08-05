package Q5.Itterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Q5i {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        // given list 2
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        // creating new empty list
        ArrayList<Integer> concatenated_list = new ArrayList<Integer>();
        Iterator<Integer> i1 = list1.iterator();
        Iterator<Integer> i2 = list2.iterator();
        Iterator<Integer> cc = concatenated_list.iterator();
        while (i1.hasNext()) {
            if (!concatenated_list.contains(i1.next())) {
                concatenated_list.add(i1.next());
            }
        }
        // using addAll( ) method to concatenate the lists
        while (i2.hasNext()) {
            if (!concatenated_list.contains(i2.next())) {
                concatenated_list.add(i2.next());
            }
        }
        while (cc.hasNext()) {
            System.out.println(cc.next() + "  ");
        }
}
}
