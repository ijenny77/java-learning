import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {

            @Override
            public int compare(Integer num1, Integer num2) {

                if (num1 % 10 > num2 % 10) {
                    return 1;
                } else if (num1 % 10 < num2 % 10) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        List<Integer> list = new ArrayList<Integer>();

        list.add(45);
        list.add(34);
        list.add(67);
        list.add(91);

        Collections.sort(list, com);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}