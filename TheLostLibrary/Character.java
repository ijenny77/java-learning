
public class Character implements Interactable {

    private String name;
    private String description;

    public Character(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String interact() {
        return name + " says: " + description;
    }
}