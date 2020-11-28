package conclusion.encapsulation;

public class EncapsulationTest{

    public static void main(String[] args) {
        LevelAccess levelAccess = new LevelAccess();

        // можно скастить любой объект к интерфейсу
        // (но может выдать класс каст эксепшен, если не реализует этот интерфейс)
        InterfaceTest interfaceTest = (InterfaceTest) new LevelAccess();

        InterfaceTestImpl interfaceTest1 = new InterfaceTestImpl();
    }
}
