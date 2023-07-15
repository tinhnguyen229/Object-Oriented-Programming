package oop_project.homework.hw6.ex6;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat");
        cat1.greets();
        Dog dog1 = new Dog("Dog");
        dog1.greets();
        BigDog bigDog1 = new BigDog("BigDog");
        bigDog1.greets();

        AbstractAnimal animal1 = new Cat("Cat");
        animal1.greets();
        AbstractAnimal animal2 = new Dog("Dog");
        animal2.greets();
        AbstractAnimal animal3 = new BigDog("BigDog");
        animal3.greets();
        // Animal animal4 = new Animal();

        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        System.out.println(animal2 instanceof Cat);
        System.out.println(animal2 instanceof Dog);
        // Cat cat2 = (Cat)animal2;

        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
        bigDog1.greets(bigDog2);
       
    }
}
