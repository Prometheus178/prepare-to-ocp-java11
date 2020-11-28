package conclusion.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListOfAndSetOf {

    public static void main(String[] args) {

        // неизменяемые списки (только чтение)
        List unmodifiableList = List.of(1, 2, 3, 4, 5);
        //  List unmodifiableListWithNull = List.of(null, 2, null, 4, 5); // нельзя в них хранить NULL

        Set unmodifiableSet = Set.of(1, 2, 3, 4, 5);
        Set set = new HashSet();

        List<StringBuilder> messages = List.of(new StringBuilder(), new StringBuilder()); // StringBuilder мутабельный м можем изменить внутри него значение
        messages.forEach(s -> s.append("helloworld"));
        messages.forEach(s -> {
            s.insert(5, ",");
            System.out.println(s);
        });
    }
}
