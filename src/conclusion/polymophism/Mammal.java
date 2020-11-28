package conclusion.polymophism;

public class Mammal {

    String name;
    static String staticName;

    Mammal(String name) {
        this.name = name;
    }

    void name() {
        System.out.println("I am mammal");
    }
}

class Cat extends Mammal {

    String name;

    Cat(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void name() {
        System.out.println("I am Cat");
    }

    void say() {
        System.out.println("Meow");
    }

    void walk() {
        System.out.println("I walk because , I am Cat");
    }
}

class Dog extends Mammal {

    Dog(String name) {
        super(name);
    }

    @Override
    void name() {
        System.out.println("I am dog");
    }

    void say() {
        System.out.println("Bark");
    }

    void bringStick() {
        System.out.println("I was bring a stick");
    }
}

class Barsik extends Cat {

    String name = "Вообще-то Барсик Барсикович";

    Barsik(String name) {
        super(name);
    }

    @Override
    void name() {
        System.out.println("I am Barsik");
    }

    @Override
    void say() {
        System.out.println("Meow I am Barsik");
    }

    void sleep() {
        System.out.println("I sleep 20 hours");
    }

}

class Lessi extends Dog {

    Lessi(String name) {
        super(name);
    }

    @Override
    void name() {
        System.out.println("I am Lessi");
    }

    void findPeople() {
        System.out.println("I am finding people");
    }
}

