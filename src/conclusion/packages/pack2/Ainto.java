package conclusion.packages.pack2;

import java.util.Date;

public class Ainto {

    public static void main(String[] args) {
        var b = new B(); // находясь в одном пакете не нужно импортировать пакет
        System.out.println(b.date.getTime()); //  в таком случае не нужно ипортировать Date;
        Date c = b.date;
        System.out.println(c.getTime());
    }
}
