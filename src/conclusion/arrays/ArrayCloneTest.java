package conclusion.arrays;

public class ArrayCloneTest {

    public static void main(String[] args) {
        char[] original = {'h', 'e', 'l', 'l', 'o'};
        char[] copy = original.clone();

        original.clone();
        System.out.println(original.length);
        print(original);
        System.out.println(copy.length);
        print(copy);

        char[] newCopyPlusPlace = copyArrayPlusNewPlace(original);
        System.out.println(newCopyPlusPlace.length);
        print(newCopyPlusPlace);

    }

    static void print(char[] array) {
        for (char val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static char[] copyArrayPlusNewPlace(char[] array) {
        int arrayLengthAndAdditionalPlace = array.length + (array.length / 2);
        char[] newArrayPlusNewPlace = new char[arrayLengthAndAdditionalPlace];

        for (int i = 0; i < array.length; i++) {
            newArrayPlusNewPlace[i] = array[i];
        }
        return newArrayPlusNewPlace;
    }


}
