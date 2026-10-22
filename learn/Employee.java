public class Employee {
    int id;
    String name;

    @Override
    public int hashCode(){
        return Objects.hash(id,name);
    }
    
    public boolean equals(Object obj) {
        Employee other = (Employee) obj;
        if(id == other.id && Objects.equals(name,other.name)){
            return true;
        }else
            return false;
    }
}