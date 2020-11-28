package conclusion.inheritance;

class SuperClass {
    SuperClass(){}
    public SuperClass(int m) {
    }
}

public class SubClass extends SuperClass {
    int i, j, k;

    public SubClass(int m, int n) {
//        super();
        i = m;
        j = m;
    } //1

    public SubClass(int m) {
        super(m);
    } //2
}