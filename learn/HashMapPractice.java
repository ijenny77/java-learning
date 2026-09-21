import java.util.HashMap;

public class HashMapPractice{
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Jenny",10);
        ages.put("Joanna",8);
        ages.put("Joshua",20);
        System.out.println(ages.get("Joshua"));
        if(ages.containsKey("Jessy")){
            System.out.println("Found: " + ages.get("Jessy"));
        }else{
            System.out.println("Not Found!!");
        }

        for(String name : ages.keySet()){
            System.out.println(name + " is " + ages.get(name) + " years old.");
        }
    }
}