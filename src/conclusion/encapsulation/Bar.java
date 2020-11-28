package conclusion.encapsulation;

public interface Bar {
    void bar();
}

abstract class FooBase {
    public static void bar() {
        System.out.println("In static bar");
    }
}

//class Foo extends FooBase implements Bar {
//
//}
