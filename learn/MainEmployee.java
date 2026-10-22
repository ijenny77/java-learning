
public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Bruce";
        Employee e2 = new Employee();
        e2.id = 1;
        e2.name = "Bruce";
        System.out.println(e1.equals(e2));
        Set<Employee>set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        System.out.println(set.size());
        
    }
}