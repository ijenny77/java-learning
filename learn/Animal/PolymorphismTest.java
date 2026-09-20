
import java.util.ArrayList;

public class PolymorphismTest {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Rex"));
        animals.add(new Cat("Cutey"));
        animals.add(new Animal("Generic"));

        for (Animal a : animals) {
            a.eat();
        }
    }
}