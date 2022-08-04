package Q5.ForLoop;

import Student.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Q5ii {
        public static List<Student> merge(List<Student> list1, List<Student> list2) {

            for (Student student : list2) {
                boolean present = list1.stream().anyMatch((e) -> {
                    return e.getFirstname().equals(student.getFirstname()) &&
                            e.getLastname().equals(student.getLastname());
                });

                if (!present) {
                    list1.add(student);
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

