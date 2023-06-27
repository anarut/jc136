package academy.lesson08;

import academy.lesson08.animal.Animal;
import academy.lesson08.animal.earth.Cat;
import academy.lesson08.animal.earth.Dog;
import academy.lesson08.animal.earth.Human;
import academy.lesson08.animal.fish.Fish;
import academy.lesson08.animal.fish.GoldFish;
import academy.lesson08.animal.fish.Shark;
import academy.lesson08.animal.flying.Bird;
import academy.lesson08.animal.flying.Dove;
import academy.lesson08.animal.flying.FlyingAnimal;
import academy.lesson08.animal.flying.Parrot;

public class Main {

    public static void main(String[] args) {
        Dove dove1 = new Dove(3, "Gray", "White");
        Dove dove2 = new Dove(5, "Black", "Black");
        Parrot parrot = new Parrot(5, "Rainbow", "Blue");

        parrot.voice();
        dove2.voice();
        dove2.poop();
        parrot.voice();

        Bird[] birds = {dove1, dove2, parrot};

        Animal[] animals = {dove1, dove2, parrot};

        Animal animal = animals[0];

        if (animal instanceof Dove) {
            Dove doveAgain = (Dove) animal;
        }

        if (animal instanceof Dove doveAgain) {
            doveAgain.poop();
        }

        Bird bird = dove1;

        Shark shark1 = new Shark(5, 50);
        Shark shark2 = new Shark(2, 456);
        GoldFish goldFish1 = new GoldFish(1);
        Fish goldFish2 = new GoldFish(4);

        Human human = new Human(20, "Black");
        Dog dog = new Dog(12, "White");
        Cat cat = new Cat(4, "Red");

        Animal[] allAnimals = {
                dove1, dove2,
                parrot,
                shark1, shark2,
                goldFish1, goldFish2,
                human,
                dog,
                cat
        };

        goldFish1.doWish("1m dollars");
        goldFish1.doWish("Village");
        goldFish1.doWish("300 Girls");
        goldFish1.doWish("Red Ferrari");
        goldFish1.doWish("Become God");


        System.out.println("-------------------");
        for (Animal a : allAnimals) {
            a.voice();
        }

        for (Animal a : allAnimals) {
            a.sleep();
        }

        Cyborg cyborg = new Cyborg();

        Speakable[] array = {parrot, human, cyborg};

        System.out.println("-------");
        for (Speakable s : array) {
            s.speak();
        }
    }
}
