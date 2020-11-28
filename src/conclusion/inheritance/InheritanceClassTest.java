package conclusion.inheritance;

class TestA {
    static int value = 10;

    TestA(int a) {
    }

    void foo(){
//    void foo()throws Exception{
        System.out.println("Test A") ;
    }

    public static void sM1() {
        System.out.println("In base static");
    }
}


class TestB extends TestA {
    TestB(int a) {
        super(a);
    }

    void foo(){
        System.out.println("Test B");
    }
    public static void sM1() { // я могу создать статик метод с таким же именем в наследнике
        System.out.println("In sub static");
    }
    // public  void sM1() {  System.out.println("In sub non-static"); }
}


class TestInheritance {
    public static void main(String[] args) {
        TestB.value = 20; // статик поле доступно и для наследников класса

        TestA testA = new TestA(20);
        TestB testB = new TestB(10);
        testA = testB; // не требуется кастинг для приведенея наследника к родителю
        testB = (TestB) testA; // требуется кастинг от родителя к наследнику

        TestA testA1 = new TestB(10);
        testA1.foo(); //Test B  если метод не бросает исключение иначе в try/catch || throws

    }
}
