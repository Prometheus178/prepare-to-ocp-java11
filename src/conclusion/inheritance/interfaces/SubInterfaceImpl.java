package conclusion.inheritance.interfaces;

public class SubInterfaceImpl implements SuperInterface{

    @Override
    public void sayHello(String text) {
        System.out.println("sub hello " + text);
    }

    @Override
    public void saySomething(String a) {
        System.out.println("overrided default" + a);
    }
}
