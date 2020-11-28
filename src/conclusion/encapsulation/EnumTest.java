package conclusion.encapsulation;

// может быть публичным или дефолтным
public enum EnumTest {
}
enum EnumTest2{

    ENUM_VALUE(10); // Enum константы всегда публичные

    EnumTest2(int i) { // конструктор всегда приватный
    }

    // поля могут иметь любые модификаторы
    private int value;
    int value2;
    protected int value3;
    public int value4;

    // методы могут иметь любые модификаторы
    private void foo(){}
    void foo2(){}
    protected void foo3(){}
    public void foo4(){}

}