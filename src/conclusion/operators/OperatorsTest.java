package conclusion.operators;

import java.time.LocalDate;

import static java.time.DayOfWeek.*;

public class OperatorsTest {

    static boolean a;
    static boolean b;
    static boolean c;

    public static void main(String[] args) {
//        int myInt = 100;
//        float myFloat = 10F;
//        int sum = (int) myFloat + myInt;
        switchTest();
        //        boolean bool = (a = true) || (b = true) && (c = true);
//        //boolean bool = (a = true) | (b = true) & (c = true);
//        System.out.print(a + ", " + b + ", " + c);
//
//        System.out.println("a" + 'b' + 63);
//        System.out.println("a" + 63);
//
//        System.out.println('b' + new Integer(63));
//        System.out.println('b');
//        String s = 'b' + 63 + "a";
//        System.out.println(s);
//        char[] b = {'j', 'a', 'v', 'a'};
//        String c = new String(b);
//        // String cCHar = new String('a'); // нельзя
//
//        String str1 = "one";
//        String str2 = "two";
//        System.out.println(str1.equals(str1 = str2));
//        System.out.println(str1);
    }

    static void switchTest() {
        int amount = 5;

        switch (amount) {
            default:
                System.out.println("amount is something else");
                break;
            case 0:
                System.out.println("amount is  0");
                break;
            case 5:
                System.out.println("amount is  5");
                break;
            case 10:
                System.out.println("amount is 10");
                break;
        }
    }
}


class Date {


    public static void main(String[] args) {
        var day = LocalDate.now().with(FRIDAY).getDayOfWeek();
        switch (day) {
            case TUESDAY:
                MONDAY:
                WEDNESDAY:
                THURSDAY:
                FRIDAY:
                System.out.println("working");
            case SATURDAY:
                SUNDAY:
                System.out.println("off");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }
    }

//    public static void main(String[] args) {
//        var day = 2;
//        switch (day) {
//            case 1:
//                2:
//                3:
//                4:System.out.println("working");
//            case SATURDAY:
//                SUNDAY:
//                System.out.println("off");
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + day);
//        }
//    }

}