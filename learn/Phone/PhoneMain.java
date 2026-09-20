public class PhoneMain {
    public static void main(String[] args){

        Samsung s = new Samsung("0788465210");
        Iphone i = new Iphone("0784279433");
        PhoneService service = new PhoneService();
        service.makeCall(s);
        service.makeCall(i);
    }
}