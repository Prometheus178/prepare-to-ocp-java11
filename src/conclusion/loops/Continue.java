package conclusion.loops;

public class Continue {

    public static void main(String[] args) {
        Continue test = new Continue();
        test.continuePractice();
    }

    void continuePractice() {
        String[] strings = {"John", "Jack", "Abraham", "Jennifer", "Ann"};

        int wordsStartingWithJ = 0;
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].toLowerCase().startsWith("j")) {
                continue;
            }
            wordsStartingWithJ++;
        }
        System.out.println(wordsStartingWithJ);
    }
}
