
import java.util.ArrayList;
import java.util.HashMap;

public class Room{
    private String name;
    private String description;
    private ArrayList<Item> items;
    private HashMap<String,Room> exits = new HashMap<>();

    public Room(String name,String description) {
        this.name = name;
        this.description = description;
        this.items = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void addItem(Item item){
        items.add(item);
    }
    public void showRoom(){
        System.out.println("\n === " + name + "=====");
        System.out.println(description);

        if(items.isEmpty()){
            System.out.println("There are no items found");
        }else{
            System.out.println("Items you can find: ");

            for(Item item :items){
                System.out.println("-" + item.getName());
            }
        }
    }

    public boolean removeItem(Item item){
        return items.remove(item);
    }

    public void addExit(String direction,Room room){
        exits.put(direction.toLowerCase(),room);
    }

    public Room getExit(String direction){
        return exits.get(direction.toLowerCase());
    }
    
    public Item findItem(String itemName) {
        for(Item item:items){
            if(item.getName().equalsIgnoreCase(itemName)){
                return item;
            }
        }
        return null;
    }
}