package examprep;

import java.util.Arrays;

public class sort2dArray {

    static int temp = 0;

    static void sort2dAss(int[][] arr) {
        // Assending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = j + 1; k < arr[i].length; k++) {
                    if (arr[i][j] > arr[i][k]) {
                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;

                    }
                }
            }
        }

    }

    static void sort2dDes(int[][] arr) {
        //Decending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = j + 1; k < arr[i].length; k++) {
                    if (arr[i][j] < arr[i][k]) {
                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;

                    }
                }
            }
        }
    }

    static void displayArr(int[][] arr) {
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                System.out.print(arr[m][n] + ", ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int[][] arr = {{3, 47, 4, 8},{24, 26, 64, 94},{24, 65, 9, 524, 420}};

        sort2dAss(arr);
        displayArr(arr);
        System.out.println();
        sort2dDes(arr);
        displayArr(arr);

    }

}
