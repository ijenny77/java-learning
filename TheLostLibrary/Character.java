public class Character implements Interactable {
    private String name;
    private String defaultDialogue;
    private String revealedDialogue;
    private boolean hasBeenGivenItem;

    public Character(String name, String defaultDialogue, String revealedDialogue) {
        this.name = name;
        this.defaultDialogue = defaultDialogue;
        this.revealedDialogue = revealedDialogue;
        this.hasBeenGivenItem = false;
    }

    public Character(String name,String defaultDialogue) {
        this(name,defaultDialogue,"I don't have anything more to say right now.")
    }

    public String getName(){
        return name;
    }

    public String getItem(){
        this.haveBeenGivenItem = true;
    }

    @Override
    public String interact(){
        if(hasBeenGivenItem) {
            return name + "says: \"" + revealedDialogue + "\"";
        }else{
            return name + " says: \"" + defaultDialogue + "\"";
        }
    }

    @Override
    public String toString() {
        return name;
    }
}