package examprep;

public class sortMultiArray {

    static int temp = 0;

    static void sortMultAss(int[][][] arr) {
        //Assending sorting
        System.out.println("Array Sorting on Assending Order: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    for (int l = k + 1; l < arr[i][j].length; l++) {
                        if (arr[i][j][k] > arr[i][j][l]) {
                            temp = arr[i][j][k];
                            arr[i][j][k] = arr[i][j][l];
                            arr[i][j][l] = temp;
                        }
                    }
                }
            }
        }

    }

    static void sortMultDes(int[][][] arr) {

        //Dessending sorting
        System.out.println("Array Sorting on Dessending Order: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    for (int l = k + 1; l < arr[i][j].length; l++) {
                        if (arr[i][j][k] < arr[i][j][l]) {
                            temp = arr[i][j][k];
                            arr[i][j][k] = arr[i][j][l];
                            arr[i][j][l] = temp;
                        }
                    }
                }
            }
        }

    }

    static void displayArray(int[][][] arr) {
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                for (int p = 0; p < arr[m][n].length; p++) {
                    System.out.print(arr[m][n][p] + " , ");
                }System.out.println();
                
            }System.out.println();
            
        }System.out.println();
        
    }

    public static void main(String[] args) {
        int[][][] arr = {{{24, -25, 6, 95}, {524, 9, 4}, {65, 95, 6}},
        {{66, 76, 6}, {65, 6732, 3}, {25, 9, 7, 6}, {6545, 965, 65}}};

        sortMultAss(arr);
        displayArray(arr);
        sortMultDes(arr);
        displayArray(arr);

    }

}
