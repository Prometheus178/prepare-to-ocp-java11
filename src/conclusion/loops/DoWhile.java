package conclusion.loops;

public class DoWhile {

    public static void main(String[] args) {
        DoWhile test = new DoWhile();
        test.practiceLoop();
    }

    void practiceLoop(){
        boolean b = false;
        int i = 1;
        do {
            i++;
        } while (b = !b);
        System.out.println(i);

    }
}
