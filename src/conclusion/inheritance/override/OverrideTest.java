package conclusion.inheritance.override;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

class OverrideTest {

    Number fooOver(int a) throws IOException {
        return null;
    }

    void  foo(Collection collection){
        System.out.println("Collection");
    }
    public <T> Collection<T> getCollection(T t, Integer n) {
        return new ArrayList<T>();
    }

    public ArrayList<Number> transform(Set<Integer> list){
        return new ArrayList<>();
    }
}

class OverrideTestA extends OverrideTest {

    public static void main(String[] args) {
    }

    @Override
    // модификатор не может быть менее доступным
    // возвращаемый тип такой же либо наследник
    // Эксепшены такие же либо наследники либо БЕЗ НИХ  ВООБЩЕ
    protected Integer fooOver(int b) throws FileNotFoundException {  // параметры должны иметь тот же тип , но может иметь другой название
        return null;
    }

    //  @Override //аннотация ошибка ,если он ничего не переопределяет
    // статик методы так же не могут быть аннотированы
    void fooNotOverride() {
    }

    //интерфейсы не ковариантны для override
    void foo(List list){
        System.out.println("List");
    }

    @Override
    public <T> List<T> getCollection(T t, Integer n) { // параметры должны иметь тот же тип!!!
        return new ArrayList<T>();
    }

    @Override // todo считается не правильным если дженерик другой и имеет extends | super
    public ArrayList<? extends Number> transform(Set list) { //  можно опустить дженерик спецификацию в аргументе
        return new ArrayList<>();
    }


}
