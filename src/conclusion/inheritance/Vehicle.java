package conclusion.inheritance;

public class Vehicle {
    protected int wheel = 4; // методы мы не можем переопределить но можно затенить , в
    // вызваз только именно через класс где лежит переменная которая затеняет родителя
    // можно вызвать поле у наследника через метод сославшись на поле этого класса
    protected String color;
   public Vehicle(String color){  // Создание конструктора с аргументом обяжет вызывать этот конструктор в наследниках
      this.color = color;
    }

    public void drive() throws Exception{
        System.out.println("driving...");
    }

    public String getColor(){
       return this.color;
    }

}

class Car extends Vehicle {

    protected String transmission;

    // создание в наследнике конструктора без аргументов обязывает вызывать конструктор родителя

//    public Car(String transmission, String color){
//        super.color = color;
//        this.transmission = transmission;
//    }

   public Car(String color){
       super(color);
   }
    public Car(String transmission, String color){
       super(color);
    //    this(color);
        this.transmission = transmission;
    }

    public void SetWheel(int count){
       this.wheel = count;
    }
    public void drive(){
        System.out.println("hyper driving...");
    }

    public void drift(){
        System.out.println("I can drifting");
    }
}


class Van extends Vehicle{

    protected String transmission;
    protected int wheel = 8;

    public Van(String transmission, String color){
        super(color);
        this.transmission = transmission;
    }

    public void openAllDoor(){
        System.out.println("Opened All Door");
    }
}