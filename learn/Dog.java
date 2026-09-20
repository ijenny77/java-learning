public class Dog {
    String name;
    int age;

    Dog(String DogName,int DogAge){
        name = DogName;
        age = DogAge;
    }
    void bark() {
        System.out.println(name + " says Woof! I am " + age + " years old .");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Rex",10);
        myDog.bark();

        Dog anotherDog = new Dog("Boby",5);
        anotherDog.bark();
    }
}