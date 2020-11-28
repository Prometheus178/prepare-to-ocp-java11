package conclusion.arrays;

public class MainTest {

    public static void main(String[] args) {
//        if (args.length != 0)   System.out.println(args[args.length-1]);
        // Массивы занимают меньше места чем ArrayList
        // прямой вызов по индексу немного быстрее чем через метод
        // НЕ потока безопасен
        //как можно создать массив
//        int[] array = new int[10]; // только одного типа / нельзя другими типами, можно наследниками типа
//        int array2[] = new int[10]; // обязателен размер массива / имеет фиксированную длину
//        System.out.println(array.length); // длина массива
//        array.clone(); // любой массив можно склонировать
//        String[] zeroLengthArray2 = new String[0]; // массив с 0 длинной , но ничего не положить

//        int[] a = null; // ok
//        System.out.println(a[0]); // NPE
        forArray();

        fooCheck("1");

        int[] a[][], b[] = new int[10][];


    }

    public static void fooCheck(String args){
        int i = args.length()-1;
        if (i > 0) System.out.println("i am here" );
    }

    static void forArray(){
        int[] array = {1,2,3,4,5};

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");

        }
    }

}

