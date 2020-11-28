package conclusion.loops;

import java.util.ArrayList;
import java.util.List;

public class Break {

    public static void main(String[] args) {
        Break test = new Break();
//        test.breakPracticeFor();
        test.breakPracticeForEach();
    }

    void breakPracticeFor() {
        String[] strings = {"John", "Jack", "Abraham", "Jennifer", "Ann"};
        List names = new ArrayList();
        int wordsStartingWithJ = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].toLowerCase().startsWith("j")) {
                wordsStartingWithJ++;
                names.add(strings[i]);
            }

            if (wordsStartingWithJ >= 3) {
                break;
            }

        }
        System.out.println(names);
    }

    void breakPracticeForEach() {
        String[] strings = {"John", "Jack", "Abraham", "Jennifer", "Ann"};
        List names = new ArrayList();
        int wordsStartingWithJ = 0;
        for (String aString : strings) {
            if (aString.toLowerCase().startsWith("j")) {
                wordsStartingWithJ++;
                names.add(aString);
            }

            if (wordsStartingWithJ >= 3) {
                break;
            }
        }
        System.out.println(names);
    }
}
