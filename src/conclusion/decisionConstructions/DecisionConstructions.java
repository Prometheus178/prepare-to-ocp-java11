package conclusion.decisionConstructions;

public class DecisionConstructions {



//    public static void main(String[] args) {
////        foo(1); // 121 без брейка напечатает все с того места где нашел совпадение
//        foo2(1); // 1 c брейком
//        //  foo3(3); // напечатает до брейка
////        foo4(4);
//    }

    public static void main(String args[]) {

    }


    void foo1(){
        var k = 9;

        switch (k) {
            case 7:
                System.out.println("7");
                break;
            default: // не важно где стоит дефолт
                System.out.println("default");
                break;
            case 5:
                System.out.println("5");
                break;
            case 4:
                System.out.println("4");
                break;
        }

    }
    static void foo(int val) {
        switch (val) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            default:
                System.out.println(val);
        }
    }

    static void foo2(int val) {
        switch (val) {
            case 1:
                System.out.println(1);
                break;
            case 2 | 3:
                System.out.println(2);
                break;
            default:
                System.out.println(val);
        }
    }

    static void foo3(int val) {
        switch (val) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
            default:
                System.out.println(val);
        }
    }

    private static void foo4(int val) {
        switch (val) {
            default:
                System.out.println(val);
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
        }
    }

    void bar() {
        int expression = 0;
        final int value = 1; // должно быть final значение
        switch (expression) { // может работать только byte,char,short, int,   String и Enum's
            case value: // case опционально и должно быть константой во время компиляции
                String str = "text";
            case 2:
                String str2 = "text2";
        }

        switch (expression) {
            default:
                String str = "text";
        }
        switch (expression) {
            case value:
                String str = "text";
        }

        switch (expression) {
            // и так тоже валидно
        }

        int x = 1; //is valid.
        switch (x) {
            case 'a':
                System.out.println("a");  // валидно для чаров
        }

        switch (1) { // можно использовать константы
            default:
                break;
        }

        final int PAYMENT = 3;
        final int PAYMENT_ORDER_CURRENCY = 4;
        switch (x) {
            case 1 | 2:
            case 'a' | 'b': // валидно
                System.out.println('c');
            case PAYMENT | PAYMENT_ORDER_CURRENCY:
                System.out.println();
        }
    }

    void fooTest(byte value) {
        switch (value) {
            case 'a':
                System.out.println("A");
                break;
        }
    }
}
