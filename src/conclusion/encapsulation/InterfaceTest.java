package conclusion.encapsulation;
//интерфейс определяет только поведение но не сам объект

// интерфейс ВСЕГДА публичный
// от него может унаследоваться любой класс
interface InterfaceTest {

    // члены класса ВСЕГДА public static final
    int value= 10;

    // может иметь абстрактный метод (но лишнее тк методы по умолчанию abstract)
    abstract void fooAbstract();
    default void setValue(){
        // код
    }

    void sameName(); // TODO: 25.08.2020 не понятно как работать с одинаковыми именами методов

    private void foo(){ // можно использовать приватный метод для декомпозиции методов
    }

    interface InnerInterface{ // всегда публичный
        int value= 10;
    }
}
