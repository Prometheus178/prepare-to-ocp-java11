package conclusion.lambda.base.functional;

import java.util.Arrays;

public class ArraysStream {

    public static void main(String[] args) {

        String[] profiles = {"test", "ac", "qa"};
        boolean profileAllSuccess = Arrays.asList(profiles).contains("qa");
        System.out.println(profileAllSuccess);
    }
}
