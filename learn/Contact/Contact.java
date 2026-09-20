

public class Contact {
    private String name;
    private String phone;
    private String email;

    Contact (String name,String phone,String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null || name.isEmpty()){
            System.out.println("Name cannot be empty!");
            return;
        }
        this.name = name;
    }

    public String getPhone() {
        return phone;
    } 

    public void setPhone(String phone){
        if(phone == null || phone.length() < 7){
            System.out.println("Phone number must be alteast 7 digits.");
            return;
        }
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    String printInfo(){
        return "Name: " + getName() + "\nPhone: " + getPhone() + "\nEmail: " + getEmail();
    }

    public static void main(String[] args) {
        Contact c1 = new Contact("Jenny","0799869715","ishimwejennymiriotta@gmail.com");
        System.out.println(c1.printInfo());
    }
}