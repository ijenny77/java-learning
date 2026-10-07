import java.util.ArrayList;

public class Player{
    private String name;
    private int energy;
    private ArrayList<Item> inventory = new ArrayList<>();

    public Player(String name){
        this.name = name;
        this.energy = 10;
        this.inventory = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getEnergy(){
        return energy;
    }

    public ArrayList<Item> getInventory(){
        return inventory;
    }

    public void showInventory(){
        if(inventory.isEmpty()){
            System.out.println("Your inventory is empty.");
        }else{
            System.out.println("Your inventory: ");

            for(Item item:inventory) {
                System.out.println("-" + item.getName());
            }
        }
    }

    public void addItem(Item item){
        if(inventory.size() >= 8){
            System.out.println("your inventory full!");
            return;
        }
        inventory.add(item);
        System.out.println(item.getName() + " added to inventory");
    }

    public void showStatus(){
        System.out.println("Explorer: " + name);
        System.out.println("Energy: " + energy + "/10");
        System.out.println("Items: " + inventory.size());
    }

    public void takeItem(Item item,Room room){
        if(inventory.size() >= 8) {
            System.out.println("Your inventory is full!");
            return;
        }
        if(room.removeItem(item)){
            inventory.add(item);
            System.out.println(item.getName() + " added to inventory!");
        }else{
            System.out.println("That item is not in the room.");
        }
    }

}