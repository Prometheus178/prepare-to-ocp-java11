package conclusion.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * ArrayList is a subclass of AbstractList.
 * All Implemented Interfaces: Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess
 * Direct Known Subclasses: AttributeList, RoleList, RoleUnresolvedList
 */
public class ArrayListTest {

    public static void main(String[] args) {

        // НЕ потока безопасен
        // занимает больше памяти чем массив
        // динамически расширяется
        // немного медленее находит индекс используя метод get()
        ArrayList arrayList = new ArrayList();
        List list = new ArrayList();
        list.add("val1");
        list.add(1, "val2");
        list.add(2, "val3");
    //    System.out.println(list);
        var values = new ArrayList<String>();
values.add("s");

        values.add(null);
        values.add(null);
        System.out.println(values);
        values.remove(null);

        System.out.println(values);
        //values.removeIf((var k) -> k.equals("a"));
        fooVarTest();
        fooArrays();
    }

    static void fooVarTest() {
        var allStudents = new ArrayList<>(); // мы не знаем что за объекты могут хранииться
        // var allStudents = new ArrayList<String>(); // хранятся Strings
        allStudents.add("hello");
        // String str =  allStudents.get(0); нужен кастинг тк не знаем что там внутри, если указан тип то не нужно
        String str = (String) allStudents.get(0);

        System.out.println(str);
    }

    static void fooArrays() {
        String[] sa = {"charlie", "bob", "andy", "dave"};
        var ls = new ArrayList<>(Arrays.asList(sa));
        ls.sort((var a, var b) -> a.compareTo(b)); // отсортирует , но можно и через компаратор
        System.out.println(sa[0] + " " + ls.get(0));
    }
}
