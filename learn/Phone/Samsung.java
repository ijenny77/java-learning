public class Samsung implements  Phone{
    String phoneNumber;
    Samsung(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void call(){
        System.out.println("Calling using Samsung. On "+ phoneNumber);
    }
}