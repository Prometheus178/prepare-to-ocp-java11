package conclusion.abountThis;

public class ThisTest {

    static int staticInt = 10;

    void callFoo(){
        this.foo(); // тоже самое что и просто вызвать
        foo();
    }

    void foo(){
        System.out.println(this);
    }

    public String toString() {

        return "ThisTest.staticInt = " + this.staticInt;
        //return "ThisTest.staticInt = " + staticInt; // виден и без указания this
    }

    public static void main(String[] args) {
        ThisTest thisTest = new ThisTest();
        thisTest.foo();
        System.out.println(thisTest.toString());
    }
}
