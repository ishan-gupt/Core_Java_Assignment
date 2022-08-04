package Q5.Itterator;

import Student.Student;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Q5ii {
    public static List<Student> merge(List<Student> list1, List<Student> list2) {
        Iterator<Student> i = list2.iterator();
        while (i.hasNext()) {
            boolean present = list1.stream().anyMatch((e) -> {
                return e.getFirstname().equals(i.next().getFirstname()) &&
                        e.getLastname().equals(i.next().getLastname());
            });

            if (!present) {
                list1.add(i.next());
            }

        }

        return list1;
    }

    public static List<Student> search(List<Student> list, String firstname, String lastname) {
        return list.stream().filter((e) -> {
            return e.getFirstname().equals(firstname) ||
                    e.getLastname().equals(lastname);
        }).collect(Collectors.toList());
    }
}

