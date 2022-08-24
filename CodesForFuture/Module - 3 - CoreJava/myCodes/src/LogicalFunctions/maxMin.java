package examprep;

import java.util.Scanner;

public class maxMin {

    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.println("How many numbers you want to input: ");
        int inp = sys.nextInt();
        int[] val = new int[inp];
        int max = val[0];
        int min = val[0];

        for (int i = 0; i < val.length; i++) {
            System.out.print("Write your " + i + " value : ");
            val[i] = sys.nextInt();

        }
        
         for (int j = 1; j < val.length; j++) {
                if (max < val[j]) {
                    max = val[j];
                }
                if(min > val[j]) {
                    min = val[j];
                    
                }
            }
        
        System.out.println(min);

        System.out.println(max + " is the max number");

    }
}
