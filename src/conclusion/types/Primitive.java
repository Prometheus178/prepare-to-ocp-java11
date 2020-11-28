package conclusion.types;

public class Primitive {
//boolean, byte, short, char, int, long, float and double.

    int anInt = 100;

    float aFloat = 10; // может быть объявлено через целочисленное значение
    float bFloat = 10F;
    float cFloat = 10f;
    float dFloat = 10.0f; // только с суффиксом F | f

    double aDouble = 10; // может быть объявлено через целочисленное значение
    double bDouble = 10D;
    double cDouble = 10d;
    double dDouble = 10.0;

    // ВСЕ математические операторы используют ВСЕ переменные
    //  !, && and || только для booleans
    // & может иметь integral как boolean оператор.
    static char ch = 0;

    public static void main(String[] args) {

//        byte var1 = 5;
//        Integer var2 = 5;
//
//        if (var1 == var2) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

        castChar();
//        var f = 4f;
//        var f0 = f;
//        int a = 9 ;
//        Integer b= 9;
//        short s  = 9;
//        System.out.println(a == b);
//        System.out.println(a == s);
//        char c = (char) 1 ;
//        boolean bool = new Boolean(true);

    }

    byte getStatusCode(Object obj) throws NullPointerException {
        if (obj != null) return 127; // 128 за пределами byte
        else return -1;
    }

   static void castChar() {
        char a = 'a', b = 98; //1
        int a1 = a; //2
        int b1 = (int) b; //3
        System.out.println((char) a1 + (char) b1); //4
    }
}
