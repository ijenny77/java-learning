
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentSort {
    public static void main(String[] args) {
        List<String>list = new ArrayList<String>();
        list.add("Joy");
        list.add("Galen");
        list.add("Eunice");
        list.add("Angella");
        list.add("Cyusa");

        Collections.sort(list);
        Iterator<String>it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}