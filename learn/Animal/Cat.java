public class Cat extends Animal{
    Cat(String name){
        super(name);
    }

    void meow(){
        System.out.println(name + " is meowing");
    }

    @Override
    void eat(){
        System.out.println(name + " eats fish");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Cutey");
        cat.eat();
        cat.meow();
    }
}