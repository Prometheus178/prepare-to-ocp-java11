package conclusion.lambda;

@FunctionalInterface
//должен быть только 1 абстрактный метод
public interface FunctionalInterfaceTest<T,R>{ // 1) T принимает
                                                // 2) R отдает

    void foo();

    // может иметь дефолтный метод
    default void foo1(){
        // код
    }
    // и иметь приватный метод
    private void privateFoo(){
    }

    // так же статик метод валиден
    static void staticFoo(){
    }
}
