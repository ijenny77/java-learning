public class Student {
    private String firstName;
    private String lastName;
    private String email;

    public String displayFirstName(){
        return this.firstName ;
    }
    public String displayLastName(){
        return this.lastName ;
    }
    public String displayEmail(){
        return this.email ;
    }
    Student(String firstName) {
        this.firstName = firstName;
    }
    Student(String firstName,String lastName,String email) {
        this(firstName);
        this.lastName = lastName;
        this.email = email;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Jenny","Miriotta","ishimwejenny11@gmail.com");
        Student s2 = new Student("Joy","Ihirwe","ihirwecelia05@gmail.com");
        System.out.println(s1.displayFirstName() + " " + s1.displayLastName() + " whose email is " + s1.displayEmail());
        System.out.println(s2.displayFirstName() + " " + s2.displayLastName() + " whose email is " + s2.displayEmail());
    }
}
