package conclusion.statics;

public class StaticTest {

    int nonStaticField;
    static int staticField;

    void fooNonStatic(){
    }
    static void fooStatic(){
        staticField = 10;
        // не доступны не статик поля и методы
    }
}
