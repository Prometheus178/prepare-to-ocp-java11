package conclusion.lambda.custom.functional;

public class Dog {
    String name;
    int age;
    int weight;

    public Dog(final String name, final int age, final int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
