package Q7;

import Student.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Q7 {
    public Q7() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Student> ts = new TreeSet<>((a, b) -> {
            return a.getFirstname().compareTo(b.getFirstname());
        });
        ArrayList<String[]> data = new ArrayList<>();

        data.add(new String[] { "Ishan", "Gupta", "ishangupta@gmail.com" });
        data.add(new String[] { "Aryansh", "Gupta", "AryanshGupta@gmail.com" });
        data.add(new String[] { "Alan", "Alex", "AlanAlex@gmail.com" });
Iterator<String[]> i= data.iterator();
       while(i.hasNext()){
            ts.add(new Student(i.next()[0], i.next()[1], i.next()[2]));
        }
            PrintStream out = new PrintStream(new FileOutputStream("./tsStudent.csv"));

            Iterator<Student> it = ts.iterator();

            while (it.hasNext()) {
                out.println(it.next());
            }
            out.close();
        }
}

