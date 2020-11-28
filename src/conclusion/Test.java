package conclusion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author s.popov
 */
public class Test {

    String s1 = "green mile";

    public void generateReport(int n) {
        String local;
        if (n > 0) local = "good";
        else local = "bad";
        System.out.println(s1 + " = " + local);



    }

    public static void main(String[] args) {
    List list =  List.of(1,2, 3,5);

        list.stream().collect(Collectors.toCollection( ArrayList<Test>::new));

    }

}
