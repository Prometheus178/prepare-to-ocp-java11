package conclusion.methods;


// 1 СТАТИК ПОЛЯ И СТАТИК БЛОКИ ИНИЦИАЛИЗАЦИИ (ПО ОЧЕРЕДИ СВЕРХУ ВНИЗ)
// 2 НЕ СТАТИК ПОЛЯ И БЛОКИ ИНИЦИАЛИЗАЦИИ (ПО ОЧЕРЕДИ СВЕРХУ ВНИЗ)
// 3 КОНСТРУКТОРЫ
public class InitTest {

    public InitTest() {
        s1 = sM1("1"); //7
    }

    static String s1 = sM1("a"); // 1
    String s3 = sM1("2"); //4

    {
        s1 = sM1("3");  //5
    }

    static {
        s1 = sM1("b"); // 2
    }

    static String s2 = sM1("c"); //3

    String s4 = sM1("4"); // 6

    public static void main(String args[]) {
        InitTest it = new InitTest();
    }

    private static String sM1(String s) {
        System.out.println(s);
        return s;
    }
}
