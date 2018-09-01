package dev.paulpalac.ooptutorial.inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 25);
        Dog dog = new Dog("Trump", 10,50, 2, 4,
            1,24, "Brown" );
        dog.eat();//dog.chew() is called
        animal.eat();//animal.eat is called
        dog.walk(5);
        dog.run(15);
        dog.move(20);

        Fish fish = new Fish("Nemo", 1, 2, 2, 2, 6);
        fish.swim(18);
    }
}
