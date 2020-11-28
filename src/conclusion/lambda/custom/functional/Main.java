package conclusion.lambda.custom.functional;

public class Main {

    public static void main(String[] args) {

        /*// анонимный класс
        Operation operation = new Operation() {
            @Override
            public double getResult(double val, double val2) {
                return val + val2;
            }
        };
        System.out.println(operation.getResult(20.0, 20.0));
*/
        /*// функционаольный способ
        Operation lambda = (val, val2) -> val + val2;
        System.out.println(lambda.getResult(20, 20));
        Printer printer = str -> System.out.println(str);
        printer.println("Hello world");

        Factorial factorial = val -> {
            int result = 1;

            for (int i = 1; i <= val; i++) {
                result = result * i;
            }
            return result;
        };

        System.out.println(factorial.getResult(5));
*/
      /*  MultiResult<String> multiString = (val1, val2) -> val1+val2;
        MultiResult<Integer> multiInteger =  (val1, val2) -> val1 + val2;
        System.out.println( multiString.getResult("Hello", "World"));
        System.out.println( multiInteger.getResult(2, 2));*/

        Dog dog = new Dog("Rex" , 5 , 40);
        Converter<Dog , Raccoon> converter = x-> new Raccoon("Raketa", 5, 20);
        System.out.println(converter.convert(dog));
    }
}
