import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class StudentGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.grade, s1.grade);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 3;
        s1.firstName = "Jenny";
        s1.lastName = "Smith";
        s1.grade = 85.5;

        Student s2 = new Student();
        s2.id = 1;
        s2.firstName = "Justin";
        s2.lastName = "Brown";
        s2.grade = 95.0;

        Student s3 = new Student();
        s3.id = 2;
        s3.firstName = "Mary";
        s3.lastName = "Smith";
        s3.grade = 90.0;

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("Original list:");
        students.forEach(System.out::println);

        Collections.sort(students);

        System.out.println("\nSorted by ID:");
        students.forEach(System.out::println);

        students.sort(new StudentGradeComparator());

        System.out.println("\nSorted by grade (descending):");
        students.forEach(System.out::println);

        Student s4 = new Student();
        s4.id = 3;
        s4.firstName = "Another";
        s4.lastName = "Smith";
        s4.grade = 70.0;

        System.out.println("\ns1 equals s4: " + s1.equals(s4));

        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s4);
        set.add(s2);

        System.out.println("HashSet size: " + set.size());
    }
}