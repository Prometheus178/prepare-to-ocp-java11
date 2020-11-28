package conclusion.lambda.custom.functional;

public class Raccoon {

    String name;
    int age;
    int weight;

    public Raccoon(final String name, final int age, final int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Raccoon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
