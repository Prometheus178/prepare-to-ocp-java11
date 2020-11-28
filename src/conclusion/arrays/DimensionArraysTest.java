package conclusion.arrays;

public class DimensionArraysTest {

    public static void main(String[] args) {


        DimensionArraysTest dimensionArraysTest = new DimensionArraysTest();
        dimensionArraysTest.initializeDiArray();
        dimensionArraysTest.initializeMultiArray();

        dimensionArraysTest.initializeDifferentlyDiArray();

    }

    static void initializeDiArray() {
        // массив с 1 вложенным массивом

        int[][] a1 = new int[2][2]; // 2 упаковки с 2 ячейками

        // в первой упаковке
        a1[0][0] = 5;
        a1[0][1] = 5;


        // во второй упаковке
        a1[1][0] = 4;
        a1[1][1] = 4;

    }

    static void initializeMultiArray() {

        int[][][] a1 = new int[2][2][2]; // 2 упаковки с 2 вложенными упаковками с 2 ячейками
        // 1 упаковка
        // 1 вложенная упаковка
        a1[0][0][0] = 1;
        a1[0][0][1] = 1;

       //  2 вложенная упаковка
        a1[0][1][0] = 2;
        a1[0][1][1] = 2;

        // 2 упаковка
        // 1 вложенная упаковка
        a1[1][0][0] = 3;
        a1[1][0][1] = 3;

       //  2 вложенная упаковка
        a1[1][1][0] = 4;
        a1[1][1][1] = 4;

    };

    static void initializeDifferentlyDiArray() {
        int[][] a1 = new int[2][]; //массив создан но внутри все элементы налл
        System.out.println(a1[1]); // null
        // System.out.println(a1[2][2]); // NPE
        // создали 2 ячейки

        // создаем в 1 ячейке массив
        a1[0] = new int[2];
        // в первой упаковке
        a1[0][0] = 5;
        a1[0][1] = 5;

        // создаем во 2 ячейке массив
        a1[1] = new int[2];
        // во второй упаковке
        a1[1][0] = 4;
        a1[1][1] = 4;

    }

    static void fooArrayDimension() {
        int[][] array = { // new int[5][]
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4},
                {1, 2, 3},
                {1, 2},
                {1}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println(); // для красоты
        }
    }

    static void fooFind() {
        String[][][] arr = { // String[4][][]
                {{"a", "b", "c"}, {"d", "e", null}},
                {{"x"}, null},
                {{"y"}},
                {{"z", "p"}, {}}
        };
        System.out.println(arr[0][1][2]);

    }
}
