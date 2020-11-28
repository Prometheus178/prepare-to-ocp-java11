package conclusion.abstractClass;

public class Main {

    public static void main(String[] args) {
        ClassImpl aClass = new ClassImpl();
        System.out.println(aClass.superResult());
        System.out.println(aClass.subResult());
        System.out.println(aClass.result());
    }
}
