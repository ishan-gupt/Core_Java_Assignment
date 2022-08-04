package Q5.ForLoop;

import java.util.ArrayList;

public class Q5i {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        // given list 2
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(5);
        list2.add(6);
        list2.add(3);
        list2.add(8);

        // creating new empty list
        ArrayList<Integer> concatenated_list = new ArrayList<Integer>();

        // using addAll( ) method to concatenate the lists
        for (int i = 0; i < list1.size(); i++) {
            if (!concatenated_list.contains(list1.get(i))) {
                concatenated_list.add(list1.get(i));
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!concatenated_list.contains(list2.get(i))) {
                concatenated_list.add(list2.get(i));
            }
        }
        for (int i = 0; i < concatenated_list.size(); i++) {
            System.out.print(concatenated_list.get(i) + " ");
        }
    }

}
