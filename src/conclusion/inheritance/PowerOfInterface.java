package conclusion.inheritance;

// интерефейсы всегда абстрактны
public interface PowerOfInterface {

    // не может быть приватным
    // private int privateInt = 10;
    int fieldInInterface = 10;


}

class Test implements PowerOfInterface {

    public static void main(String[] args) {
        TestInterface test = new TestInterface();
        int k = PowerOfInterface.fieldInInterface;
        int i = test.fieldInInterface;
        int l = fieldInInterface;
    }
}
