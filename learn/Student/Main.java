
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) { 
            System.out.println("1.Add Student");
            System.out.println("2.View All Students");
            System.out.println("3.Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1){
                System.out.print("Name: ");
                name = scanner.nextLine();
                int[] scores = new int[3];
                for (int i = 0; i < 3; i++) {
                    System.out.println("Enter a score: ");
                    scores[i] = scanner.nextInt();
                }
                Student student = new Student(name,scores);
                students.add(student);     
            }else if (choice == 2) {
                for(Student student : students){
                    System.out.println("Name: " + student.name );
                    System.out.println("Scores: " + Arrays.toString(student.scores));
                    System.out.println("Average: " + student.getAverage());
                    System.out.println("Grade: "  + student.getGrade());
                    System.out.println("------------------------------");
                }
            }else if(choice == 3){
                break;
            }
        }
    }   
}