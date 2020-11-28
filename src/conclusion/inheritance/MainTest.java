package conclusion.inheritance;

public class MainTest {

    public static void main(String[] args) throws Exception {
        Vehicle carVehicle = new Car("MANUAL", "red");
        System.out.println(carVehicle.color);
        System.out.println(carVehicle.wheel);
        System.out.println(((Car)carVehicle).transmission);
        try {
            carVehicle.drive();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ((Car) carVehicle).drift();

//        Vehicle vanVehicle = new Van("Auto", "red");
//        System.out.println(vanVehicle.color);
//        System.out.println(vanVehicle.wheel);
//        System.out.println(((Van)vanVehicle).transmission);
//        vanVehicle.drive();
//        ((Van) vanVehicle).openAllDoor();

//        Car car = new Car("Manual", "black");
//        System.out.println(car.wheel);
//        System.out.println(car.color);
//        System.out.println(car.transmission);
//        car.drive();
//        car.drift();

//        Van van = new Van("Auto" , "Blue");
//        System.out.println(van.wheel);
//        System.out.println(van.color);
//        System.out.println(van.transmission);
//        van.drive();
//        van.openAllDoor();

    }
}
