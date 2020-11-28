package conclusion.stringAPI;

import java.nio.charset.Charset;

public class StringMethods {

    public static void main(String[] args) {
        String variable = "Hello World";
        String one = "This is a good day to code";

        System.out.println( one.startsWith("This")    );
        System.out.println( one.startsWith("This", 5) );

        String theString = "This is a good day to code";

        System.out.println( theString.charAt(0) );
        System.out.println( theString.charAt(3) );

        String theString2 = "This is a good day to code";

        byte[] bytes1 = theString2.getBytes();
        byte[] bytes2 = theString2.getBytes(Charset.forName("UTF-8"));

        System.out.println( one.endsWith  ("code")    );
        System.out.println( one.endsWith  ("shower")  );
        System.out.println(variable.isBlank()); //false
        System.out.println(variable.length()); // 11
        System.out.println(variable.charAt(3)); // l
        System.out.println(variable.indexOf('W')); // 6
        System.out.println(variable.substring(5)); //World
        System.out.println(variable.substring(3, 7)); // lo W вырезало по факту от 3 до 6 элемента
        System.out.println(variable.substring(7, 7)); // вернет ""
        System.out.println(variable.concat("!!!")); //Hello World!!!
        System.out.println(variable.toLowerCase()); // hello world
        System.out.println(variable.toUpperCase()); // HELLO WORLD
        System.out.println(variable.replace('e', 'y')); //Hyllo World

        System.out.println(variable.equals("abc")); // false
    }

    static void display(String value) {
        System.out.println(value);
    }


}
