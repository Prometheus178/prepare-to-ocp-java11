package conclusion.inheritance.override;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String args[]) {
        List<? super Integer> list = getNumber();
        for(Object num : list){
            System.out.println(num);
        }
    }

    static List<? super Integer> getNumber(){
        List<? super Integer> arr = new ArrayList();

        arr.add(new Integer(1));
        arr.add(new Integer(2));
        arr.add(new Integer(3));
        arr.add(new Integer(4));

        return arr;
    }
}
