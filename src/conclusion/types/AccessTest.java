package conclusion.types;

public class AccessTest{
    String a = "x";
    static char b = 'x';
    String  c = "x";
    class Inner{
        String  a = "y";
        String  get(){
            String c = "temp";
            // Line 1
            c = AccessTest.this.a;
            c = this.a;
            c = ""+b;
            return c;
        }
    }

    AccessTest() {
        System.out.println(  new Inner().get()  );
    }

    public static void main(String args[]) {  new AccessTest();  }
}