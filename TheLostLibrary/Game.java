
import java.util.Scanner;

public class Game {
    private Player player;
    private Room currentRoom;
    private Scanner scanner;

    public Game(){
        scanner = new Scanner(System.in);

        Room grandHall = new Room(
            "Grand Hall",
            "A large hall with tall wooden doors."
        );

        Room readingRoom = new Room(
            "Reading Room",
            "Tall windows overlook the courtyard. Books cover the desk."
        );

        Item lantern = new Item(
            "lantern",
            "A small lantern that lights dark corridors."
        );

        readingRoom.addItem(lantern);

        grandHall.addExit("east", readingRoom);
        readingRoom.addExit("west", grandHall);

        currentRoom = grandHall;
    }

    public void start(){
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        player = new Player(name);

        System.out.println("\nWelcome to The Lost Library, " + player.getName() + "!");
        boolean playing = true;

        while (playing) {
            currentRoom.showRoom();

            System.out.println("\nWhat would you like to do?");
            System.out.println("1.Move");
            System.out.println("2.Take an item");
            System.out.println("3.View inventory");
            System.out.println("4.Quit");
            System.out.println("Choose an option");

            String choice = scanner.nextLine();

            switch(choice) {
                case "1":
                    move();
                    break;
                case "2":
                    takeItem();
                    break;
                case "3":
                    player.showInventory();
                    break;
                case "4":
                    playing = false;
                    System.out.println("Thanks for exploring!");
                    break;
                default:
                    System.out.println("Please choose a number from 1 to 4.");
            }
        }
    }

    public void move(){
        System.out.println("Which direction? (east/west)");
        String direction = scanner.nextLine().trim();

        Room nextRoom = currentRoom.getExit(direction);

        if(nextRoom != null) {
            currentRoom = nextRoom;
            System.out.println("You move to " + currentRoom.getName() + ".");
        }else{
            System.out.println("You can not go that way.");
        }
    }

    public void takeItem(){
        System.out.println("Which item would you want to take? ");
        String itemName = scanner.nextLine().trim();

        Item item = currentRoom.findItem(itemName);

        if(item == null){
            System.out.println("That item is not in this room.");
            return;
        }
        player.takeItem(item, currentRoom);
    }
}