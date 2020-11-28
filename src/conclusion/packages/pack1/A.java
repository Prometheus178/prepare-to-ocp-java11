package conclusion.packages.pack1;

import conclusion.packages.pack2.B;

import java.util.Date;

public class A {


    public static void main(String[] args) {
        var b = new B();
        System.out.println(b.date.getTime()); //  в таком случае не нужно ипортировать Date;
        Date c = b.date;
        System.out.println(c.getTime());
    }
}
