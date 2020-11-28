package conclusion.arrays;

public class ArrayCreateTest {

    public static void main(String[] args) {
        int[] a1 = new int[1];
        int[] a2 = {1, 2, 3, 4, 5};
        int[] a3 = new int[]{1, 2, 3, 4, 5};

        String[] myStringArray = new String[3];
        String[] myStringArray2 = {"a", "b", "c"};
        String[] myStringArray3 = new String[]{"a", "b", "c"};

        // это не матрицы , а массивы в массивах
        int[][] aa1 = new int[2][2];
        int[][] aa2 = new int[2][];
        int[][] aa3 = new int[][]{};
        int[][] aa5 = {
                {1, 2, 3, 4, 5},  // [4][5]
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        int[][] aa4 = new int[][]{
                {1, 2, 3, 4, 5},  // [4][5]
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };

        String[][] myStringAArray = new String[3][3];
        String[][] myStringAArray1 = new String[3][];
        String[][] myStringAArray2 = {{"a", "b", "c"}, {"a", "b", "c"}, {"a", "b", "c"}}; // [3][3]
        String[][] myStringAArray3 = new String[][]{{"a", "b", "c"}, {"a", "b", "c"}, {"a", "b", "c"}}; // [3][3]

        int[][][] aaa1 = new int[5][5][5];
        int[][][] aaa2 = new int[5][][];
        int[][][] aaa3 = new int[][][]{};
        int[][][] aaa4 = new int[][][]{ //[3][3][3]
                {{1, 2, 3,}, {1, 2, 3,}, {1, 2, 3,}},
                {{1, 2, 3,}, {1, 2, 3,}, {1, 2, 3,}},
                {{1, 2, 3,}, {1, 2, 3,}, {1, 2, 3,}}
        };
        int[][][] aaa5 = { //[3][3][3]
                {{1, 2, 3,}, {1, 2, 3,}, {1, 2, 3,}},
                {{1, 2, 3,}, {1, 2, 3,}, {1, 2, 3,}},
                {{1, 2, 3,}, {1, 2, 3,}, {1, 2, 3,}}
        };

    }
}
