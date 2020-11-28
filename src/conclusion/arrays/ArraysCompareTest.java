package conclusion.arrays;

import java.util.Arrays;

public class ArraysCompareTest {

    public static void main(String[] args) {
        char[] a = {'h', 'e', 'l', 'l'};
        char[] b = {};
        int x = Arrays.compare(a, b);
        int y = Arrays.mismatch(a, b);
        System.out.println(x + " " + y);
    }
}
