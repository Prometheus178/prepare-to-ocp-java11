package conclusion.inheritance;

import conclusion.inheritance.Car;
import conclusion.inheritance.Vehicle;

import java.awt.*;

// instanceOf работает только с ссылочными типами
public class InstanceOfTest {

    public static void main(String[] args) {

        Integer aInt = 5;
        Double aDouble = 10.0;

        // компилятор знает какой это тип и не даст использовать если они не связаны наследованием
//        if (aDouble instanceof Number) { // он не говорит какой это тип, а только что он ли это
//            System.out.println("это интеджер");
//        }

        Vehicle vehicle = new Vehicle("blue");
//        isVehicle(vehicle);

        Car car = new Car("Manual", "black");
//        isVehicle(car);


    }


    static void isVehicle(Vehicle vehicle) {
        if (vehicle instanceof Vehicle) {
            System.out.println("it is true");
        } else {
            System.out.println("false");
        }
    }

    static void isVehicle(Car car) {
        if (car instanceof Vehicle) {
            System.out.println("it is true");
        } else {
            System.out.println("false");
        }
    }

    static void isVehicle(Car car, Van van) {
        // не скомпилируется
//        if (car instanceof Van) { // НЕЛЬЗЯ сравнить наследников одного и того же родителя
//            System.out.println("it is true");
//        } else {
//            System.out.println("false");
//        }
    }
}
