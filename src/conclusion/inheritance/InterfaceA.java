package conclusion.inheritance;

interface InterfaceA {
}

interface InterfaceB {
    int VALUE = 10;
    void m1();
}

interface InterfaceC extends InterfaceA, InterfaceB {

    @Override
    public void m1();
    public void m1(int a);
}
