package ua.com.codefire._03_arrays;

public class Main {

    public static void main(String[] args) {

        // 1. One dimension  array

        int[] array = new int[5];
        array[0] = 4;
        array[1] = 8;

        int a = array[0];
        System.out.println("array[0] = " + a);

        // FOR loop
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // FOREACH loop
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // create and init array
        int[] data = {4, 6, 2, 9, 3, 5, 6, 7};

        // 2. Two dimension array (matrix or 'array of arrays')

        int[][] twoDimArr = new int[3][4];
        /*
        0 0 0 0
        0 0 0 0
        0 0 0 0
         */

        twoDimArr[1][2] = 5;
        /*
        0 0 0 0
        0 0 5 0
        0 0 0 0
         */

        System.out.println();

        for (int i = 0; i < twoDimArr.length; i++) {
            int[] innerArr = twoDimArr[i];
            for (int j = 0; j < innerArr.length; j++) {
                System.out.print(innerArr[j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] arr : twoDimArr) {
            for (int elem : arr) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // create and init two-dimension array
        int[][] initTwoDimArr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }
}
