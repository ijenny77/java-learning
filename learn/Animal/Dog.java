public class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    void bark(){
        System.out.println(name + " says woof!");
    }

    @Override
    void eat(){
        System.out.println(name + " eats a bone");
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob");
        dog1.bark();
        dog1.eat();
    }
}