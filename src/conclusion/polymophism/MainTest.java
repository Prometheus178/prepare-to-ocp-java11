package conclusion.polymophism;

public class MainTest {

    public static void main(String[] args) {
//       Mammal mammal = new Mammal("Млекопитающее");
//        System.out.println(mammal.name);
//        mammal.name();
//
//        Mammal mammalСat = new Cat("Барсик");
//        mammalСat.name();
//        ((Cat) mammalСat).say();
//        System.out.println(((Cat)mammalСat).name);
//
//        Cat cat = new Cat("Барсик");
//        System.out.println(cat.name);
//
//        Dog dog = new Dog("Лесси");
//        dog.name();
//        dog.say();

        // dog = (Dog )mammal; // class cast эксепшн ( не каждое млекопитающее собака)
      //  dog = (Dog) cat; // class cast эксепшн ( кошка не может стать собакой)

//        Mammal mammalDog = new Dog("Лесси");
//        System.out.println(mammalDog.name);
//        mammalDog.name(); // может использовать только общее поведение
//        System.out.println(((Dog) mammalDog).name);
       // mammalDog.say(); // ему не доступно
//        ((Dog) dog).say();
//        ((Dog) dog).bringStick();
//        mammalDog = cat; //собака станет кошкой потому что при СОЗДАНИИ собаки был общий родитель с кошкой
//        mammalDog.name();

        Mammal mammalBarsik = new Barsik("Барсик");
        System.out.println(Mammal.staticName); // есть доступ, статик поле не относится к экземпляру (не важна реализация)
        System.out.println(mammalBarsik.name);
        System.out.println(((Barsik)mammalBarsik).name);
        mammalBarsik.name(); // ему доступно только общее поведение млекопитающих
        ((Cat) mammalBarsik).name(); // каст не даст ему вызвать метод родителя, тк  мы его переопредили
        ((Cat) mammalBarsik).say(); // но можем вызвать остальные методы родителя
        ((Cat) mammalBarsik).walk();
        ((Barsik) mammalBarsik).name(); // не нужно он уже является этой конкретной реализацией
        ((Barsik) mammalBarsik).sleep(); // можно вызвать методы конкретной реализации

//
//        Cat cat1 = new Barsik("Барсик");
//        cat1.name();
//        cat1.walk();
//        cat1.say();
//
        Barsik barsik = new Barsik("Барсик");
       // Barsik.staticName;  // для наследников нет доступа к статик полю
        barsik.name();
        barsik.say();
        barsik.walk();
        barsik.sleep();

    }
}
