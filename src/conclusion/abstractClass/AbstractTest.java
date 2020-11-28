package conclusion.abstractClass;

// абстрактынй класс нельзя создать
// подразумевает наследование
public abstract class AbstractTest implements Tool { // могут  реализовывать интерфейс

    // абстрактные методы не реализованы
    abstract void foo();

    // статик методы не могут быть переопределены
    static void fooStatic() {
    }

    @Override
    public void operate() {
    }

    //  native метод не мб abstract
    // abstract native int absMethod(int param) throws Exception;

    // абстрактный метод не может быть приватным
    //private abstract void fooPrivateAbstract();
    // может иметь любой модификатор
    private final void foo1() {
    } // может быть final но оно бесмысленно

    private void foo2() {
    }

    void foo3() {
    }

    protected void foo4() {
    }

    public void foo5() {
    }

}

interface Tool {
    void operate();
}

