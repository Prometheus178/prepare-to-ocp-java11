package conclusion;

import conclusion.inheritance.Vehicle;
import conclusion.packages.pack1.A;

public class Count {

    public static void main(String[] args){
        var a = 11;
        var count = 0;
        for (var i = 5; i < a; i++) {
            count = count + i;
        }
//        count = count + 35;
//        count = count + 6;

        System.out.println(count);
    }
}
