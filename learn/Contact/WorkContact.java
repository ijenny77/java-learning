public class WorkContact extends Contact {
    String Company;
    WorkContact(String name,String phone, String email,String company){
        super(name,phone,email);
        this.company = company;
    }
}