package conclusion.arrays;

import java.util.Arrays;

public class CompareAndMismatch {
    public static void main(String[] args) {
        //  fooCompare();
        fooMismatch();
    }

    private static void fooMismatch() {

        int[] a = {'h', 'e', 'l', 'l', 'o'};
        int[] b = {'h', 'e', 'l', 'l', 'o'};
        // элемент которого не совпал
        // если равны то -1
        int x = Arrays.mismatch(a, b);
        System.out.println(x);
    }

    static void fooCompare() {
        // a < b
        int[] a = {'h', 'e', 'l'};
        int[] b = {'h', 'e', 'l', 'l', 'o'};
        int x = Arrays.compare(a, b);
        System.out.println(x); // -2

        // aaa > bbb
        int[] aaa = {'h', 'e', 'l', 'l', 'o'};
        int[] bbb = {'h', 'e', 'l'};
        int z = Arrays.compare(aaa, bbb);
        System.out.println(x); // -2

        // aa == bb
        int[] aa = {'h', 'e', 'l', 'l', 'o'};
        int[] bb = {'h', 'e', 'l', 'l', 'o'};
        int y = Arrays.compare(aa, bb);
        System.out.println(y); // 0

//        // aa1 != bb1
//        int[] aa1 = {'h', 'e', 'g', 'g', 'o'};
//        int[] bb1 = {'h', 'e', 'l', 'l', 'o'};
//        int y1 = Arrays.compare(aa1, bb1);
//        System.out.println(y1); // -1

        // aa1 != bb1
        int[] aa1 = {'m', 'a', 'g', 'g', 'o'};
        int[] bb1 = {'h', 'e', 'l'};
        int y1 = Arrays.compare(aa1, bb1);
        System.out.println(y1); // -1

    }
}
