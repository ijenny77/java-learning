public class Iphone implements  Phone{
    String phoneNumber;
    Iphone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void call(){
        System.out.println("Calling using iPhone. On "+ phoneNumber );
    }
}