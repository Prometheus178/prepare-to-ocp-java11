package conclusion.encapsulation;

public class VariableTest {
    public static void main(String[] args) {
        Sub s = new Sub();
        int k = s.i;
        System.out.println(k); // 20
        k = ((Base) s).i;
        System.out.println(k); // 10

        Base b = new Sub();
        k = b.i;
        System.out.println(k); //10
    }
}

class Base {
   int i = 10;
}

class Sub extends Base {
    int i = 20; //This i hides Base's i
}

