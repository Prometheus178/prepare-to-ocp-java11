package conclusion.lambda.custom.functional;

@FunctionalInterface
public interface Converter<T , R> {

    R convert(T t);

    static boolean isNotNull(String t) {
        return t != null;
    }

    default void writeToConsole(Object t) {
        System.out.println("Текущий объект - " + t.toString());
    }

    boolean equals(Object obj);
}
