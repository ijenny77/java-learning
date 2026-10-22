import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();

        students.add(new Student("Mike", "Galen", 78));
        students.add(new Student("Sano", "Angella", 18));
        students.add(new Student("Shami", "Adelin", 13));

        Collections.sort(students, new AgeComparator());

        for (Student student : students) {
            System.out.println(student.lname + " " + student.fname + " - " + student.age);
        }
    }
}