package conclusion.constructors;

public class ConstructorTest {


    int value;

    // дефолтный , те не параметризированный
    public ConstructorTest() {
    }

    public ConstructorTest(int a) {
        // вызов из конструктора другой конструктор
    //    this(); // 1 строкой
        //  this - это просто сигнал компилятору ссылаться на этот класс
        //  is not necessary
        this.value = a;
    }

}

class Vehicle {
    private String regNo = null;

    public Vehicle(String no) {
        this.regNo = no;
    }

}

class Car extends Vehicle {
    private String brand = null;


    public Car(String br, String no) {
// subclass must call a constructor in the superclass inside one of the subclass constructors!
        // ссылка на родительский конструктор
        super(no); // 1 строкой

        this.brand = br;
    }

    public Car(String brand) throws Exception {
//        this(brand, "no");
        super(brand);
        if (brand == null) {
            throw new Exception("The brand parameter cannot be null!");
        }
    }


    public static void main(String[] args) {
        Car car = null;
        try{
            car = new Car("Mercedes");
            //do something with car object
        } catch(Exception e) {
            // handle exception
        }
    }
}
