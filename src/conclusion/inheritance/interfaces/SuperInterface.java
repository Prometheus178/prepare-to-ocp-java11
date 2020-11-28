package conclusion.inheritance.interfaces;

public interface SuperInterface {
    void sayHello(String text);

    default void saySomething(String a){
        System.out.println("default" + a);
    }
}

interface SubInterface extends SuperInterface {
    // можно переопределять абстрактные и дефолтные методы
    @Override
    void sayHello(String a);

    @Override
    void saySomething(String text);
}
