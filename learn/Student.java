import java.util.Objects;

public class Student implements Comparable<Student> {
    int id;
    String firstName;
    String lastName;
    double grade;

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;

        if (id == other.id && Objects.equals(lastName, other.lastName)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{id=" + id
                + ", firstName='" + firstName
                + "', lastName='" + lastName
                + "', grade=" + grade + "}";
    }
}