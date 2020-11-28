package conclusion.inheritance.interfaces;

public class SuperInterfaceImpl implements SuperInterface{

    @Override
    public void sayHello(String text) {
        System.out.println("super hello " + text);
    }
}
