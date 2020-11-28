package conclusion.fields;

public class Field {

    static String staticField = "Static field not belongs to an instance";

    public static void main(String[] args) {
        short s = Short.MAX_VALUE;
        char c =(char) s;

        System.out.println( c == Short.MAX_VALUE);
    }
}
