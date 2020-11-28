package conclusion.collection;

import conclusion.packages.pack1.A;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        list.forEach((str) -> {
            if (str.equals("1")) list.add("1");
            if (str.equals("2")) list.remove(str);
        });
    }
}
