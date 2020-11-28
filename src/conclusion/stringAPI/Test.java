package conclusion.stringAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] sa = {"charlie", "bob", "andy", "dave"};
        var ls = new ArrayList<String>(Arrays.asList(sa));
        ls.sort((var a, var b) -> a.compareTo(b));
        ls.forEach(System.out::println);
       // System.out.println(sa[0] + " " + ls.get(0));

    }
}
