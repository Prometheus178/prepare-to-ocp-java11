package conclusion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Car implements Serializable{
}

public class Main {

    public static void main(String[] args) {
        Car car= new Car();
        Serializable serializable;
        List arrayList = new ArrayList();
        arrayList.add(car);

        if (arrayList instanceof Serializable){
            System.out.println("serialize");
        }else {
            System.out.println("not");
        }
    }
}
