package conclusion.loops;

public class While {


    public static void main(String[] args) {
        foo();
    }

    static void foo() {
        String[] strings = {"John", "Jack", "Abraham", "Jennifer", "Ann"};

        int wordsStartingWithJ = 0;
        int i = 0;

        do {
            if (!strings[i].toLowerCase().startsWith("j")) {
                i++;
                continue;
            }
            wordsStartingWithJ++;
            i++;
        } while (i < strings.length);
    }
}
