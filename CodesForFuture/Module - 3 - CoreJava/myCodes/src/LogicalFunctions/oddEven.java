package examprep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class oddEven {

    static void oddEven() {
        Scanner sys = new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList();
        System.out.println("Put your starting number");
        int start = sys.nextInt();
        System.out.println("Put your ending number");
        int end = sys.nextInt();

        for (int i = start; start <= end; start++) {
            if (start % 2 == 0) {
                System.out.println("even number: " + start + ",");
            } else {
                System.out.println("odd number: " + start + ",");

            }

        }

    }
    
    public static void main(String[] args) {
        oddEven();
    }
}
