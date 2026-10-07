import java.util.List;
import java.util.Date;

public class GenericUsage{
    public static void main(String []args){
        List a = new ArrayList;
        a.add(10);
        a.add("Hello");
        a.add(new Date())
        String s = a.get(1);
        System.out.println(s);
        List<Integer> scores = new ArrayList<Integer>();
        scores.add(10);
        scores.add("Hello");
    }
}