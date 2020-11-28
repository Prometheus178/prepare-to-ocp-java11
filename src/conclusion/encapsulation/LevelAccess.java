package conclusion.encapsulation;

// класс может быть публичным либо
public class LevelAccess {
    // public < protected < package (i.e. no modifier) < private

    int i; // виден внутри пакета
    public int j; // виден из разных пакетов
    protected int k; // виден внутри пакета , также у наследников из других пакетов
    private int l; // виден внутри класса
}

interface Interface {
    void foo();
}

class Main {
    // скомпилируется но выдаст ошибку если использовать
    Interface anInterface = (Interface) new LevelAccess();

}

// класс может быть дефолнтым
class LevelAccess2 {

    // внутренние классы могут иметь любые модификаторы
    public class InnerClass {
    }

    protected class InnerClass2 {
    }

    private class InnerClass3 {
    }

    class InnerClass4 {
    }


}


