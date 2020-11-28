package conclusion;

public class StaticObject {
    static String name = "Hello static";
    String surName = "not static in static";
    static String foo() {
        return "static Method";
    }
}


class SubClass extends StaticObject{

    String surName = "not static in non static";

//    String foo() {
//        return "non static Method";
//    }

    public static void main(String[] args) {
        StaticObject staticObject = new SubClass();
        System.out.println(staticObject.name);
        System.out.println(staticObject.foo());
        System.out.println(staticObject.surName);
    }
}