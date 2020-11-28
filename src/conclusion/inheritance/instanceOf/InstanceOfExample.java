package conclusion.inheritance.instanceOf;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class InstanceOfExample {

    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap();
        HashMap<Object, Object> hashMap = new HashMap();

        boolean hashMapIsHashMap = map instanceof HashMap;
        System.out.println(hashMapIsHashMap);

        //не важно на сколько далеко родитель по иерархии находится
        boolean mapIsObject = map instanceof Object;
        System.out.println(mapIsObject);

        // так же и с интерфейсами его реализущими
        SortedMap<Object, Object> sortedMap = new TreeMap();
        boolean sortedMapIsMap = sortedMap instanceof Map;
        System.out.println(sortedMapIsMap);
        boolean mapIsMap = map instanceof Map;
        System.out.println(mapIsMap);
        boolean hashMapIsMap = hashMap instanceof Map;
        System.out.println(hashMapIsMap);

        // если переменная ссылаетс на налл то оператор интсансОф вернет false даже при работе с интерфейсом
        Map<Object, Object> mapNull = null;
        boolean mapNullIsObject = mapNull instanceof Map;
        System.out.println(mapNullIsObject);

        // компилятор  не даст использовать instanceof если класс final либо не наследник конкретного класса
        String myString = "Hey";
//            if(myString instanceof Integer) {
//            }
        downCast();
    }


    static void downCast() {
        Map<Object, Object> map = new TreeMap();
        if (map instanceof SortedMap) {
            SortedMap sortedMap = (SortedMap) map;
            System.out.println("map is sortedMap");
        }
    }
}
