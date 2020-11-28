package conclusion.methods;

public class Test {

    static int x;
    int a;

    public static void main(String[] args) {       // lot of code.
        x = 10; // из статик метода можно дотянуться только до статик поля
        // this.a = 1; this не  достумен для статик метода
        float f = Float.NaN;
    }

    public long methodX(byte by) {
        double d = 10.0;
        return (long) ( by / d * 3);
    }

    public double methodY(byte by) {
        double d = 10.0;
        return (long)  by / d * 3;
    }
}
