public class Item implements Interactable {

    private String name;
    private String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Item(String name) {
        this(name, "A curious object with no visible markings.");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String interact() {
        return "You examine the " + name + ". " + description;
    }

    @Override
    public String toString() {
        return name;
    }
}