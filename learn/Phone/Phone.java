public interface Phone {

    String phoneNumber = "0788";

    void call();

    default  void getMyNumber() {
        System.out.println("Phone number: "+ phoneNumber);
    }


}