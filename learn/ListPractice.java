
import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("mango ");
        fruits.add("banana ");
        fruits.add("apple ");
        fruits.add("pineapple ");

        System.out.println(fruits.size());

        for(int i = 0;i<fruits.size();i++){
            System.out.print(fruits.get(i));
        }
        fruits.remove(1);
        System.out.println(fruits);
    }
}