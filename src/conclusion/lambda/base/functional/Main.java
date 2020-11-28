package conclusion.lambda.base.functional;

import java.util.EnumSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isZero = value -> value == 0;
        System.out.println(isZero.test(0));

        Consumer<String> printer = value -> System.out.println(value);
        printer.accept("Hello world");

        Function<Integer, Double> converter = value -> value.doubleValue();
        System.out.println(converter.apply(100));

  /*      Supplier<String> text = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input text: ");
            return scanner.nextLine();
        };
        System.out.println(text.get());*/

        UnaryOperator<Double>  sqrt = value -> Math.sqrt(value);
        System.out.println(sqrt.apply(5.0));

        BinaryOperator<Double> pow = (val1 ,val2) -> Math.pow(val1, val2);
        System.out.println(pow.apply(2.0, 5.0));

    }
}
