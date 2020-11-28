package conclusion.loops;

import java.util.List;

public class LoopsTest {
 // break without a label, can occur only in a switch, while, do, or for statement.

    public static void main(String[] args) {
        fooLoop();
    }
    static void fooLoop(){
        boolean b = false;
        int i = 1;
        do{
            i++ ;
        } while (b = !b);
        System.out.println( i );
    }
    void fooDoWhile(){
        int i = 0;
        do {
         i++;  // выполнится хоть 1 раз
            break; // валидно
        }while (i < 10);

    }

    void fooWhile() {

        int i = 0;  // шаг 1
        while (i < 10) { // шаг 2
            System.out.println(i); // шаг 3
            i++; // шаг 4
            if (true)continue; // пропускает все что находится после него, но продолжает цикл
            else break; // прекращает весь цикл
        }

        while (true) ; // валидно


    }

    void fooFor() {
             // шаг 1        //шаг 2    // шаг 4
        for (int i = 0;     i < 10;    i++) {
            if (true)continue;
            else break; // шаг 3
        }

        for (; ; ) ; // валидно
    }


    void forEachFoo() {
        List list = null;

        for (var a : list) { // для работы с массивами и Iterable
            if (true)continue;
            else break;
        }
    }
}
