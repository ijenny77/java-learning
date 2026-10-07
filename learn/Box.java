import java.util.List;
import java.util.ArrayList;
class Box {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Joshua");
        names.add("Job");
        names.add("Aline");

        List<Integer> ages = new ArrayList<>();
        ages.add(40);
        ages.add(20);
        ages.add(15);

        displayValue(names);
        displayValue(ages);
    }

    public static <T> void displayValue(List<?> values){
       for(Object value : values ){
        System.out.println(value);
       }
    }   
}   