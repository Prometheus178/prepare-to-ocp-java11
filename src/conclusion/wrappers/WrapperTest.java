package conclusion.wrappers;

public class WrapperTest {

    public static void main(String[] args) {


        short s = 20000;      //1
        int iP = 9;
        Integer iW = 20000;
        System.out.println(s == iP); // по значению  true
        System.out.println( s == iW ); // сработает анбоксинг и сравнит по значению

        String stringInt = Integer.toHexString(1);
        String stringInt2 = Integer.toBinaryString(1);
        String stringInt3 = Integer.toOctalString(1);
        System.out.println(stringInt); // 1
        System.out.println(stringInt2); // 1
        System.out.println(stringInt3); //1
    }
}
