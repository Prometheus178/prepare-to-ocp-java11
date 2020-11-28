package conclusion.loops;

public class ForEach {

    public static void main(String[] args) {
        ForEach loop = new ForEach();
//        loop.iterateString();
        loop.iterateInt();
    }

    void iterateString() {
        String[] strings = {"one", "two", "three"};
        for (String str : strings) {
            System.out.println(str);
        }
    }

    void iterateInt() {
        int[] ints = {1, 2, 3};
        for (final int i : ints) {
            System.out.println(i);
        }
    }
}
