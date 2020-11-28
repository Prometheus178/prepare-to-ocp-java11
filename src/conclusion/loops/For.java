package conclusion.loops;

public class For {
    public static void main(String[] args) {
        For loop = new For();
        loop.insideLoop();
    }

    void many() {
        for (int i = 0, j = 0, m = 0; i < 10 | j < 10; i++, j++, m++) {
            System.out.println("I is: " + i); // 0->9
            System.out.println("J is: " + j); // 0->9
            System.out.println("M is: " + m); // 0->9
        }
    }

    void reference() {
        int i = 0;
        boolean a = i < 10;
        for (; a; i++) {
            System.out.println("I is: " + i); // infinity
        }
    }

    void insideLoop() {
        outer:
        for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 2; j++) {
                if (i == j) {
                    continue outer;
                }
                System.out.println("i=" + i + " , j=" + j);
            }
        }
    }
}
