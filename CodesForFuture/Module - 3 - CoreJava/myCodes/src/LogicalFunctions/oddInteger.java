package examprep;

import java.util.Scanner;

public class oddInteger {

    static void oddInt() {
        System.out.print("put Integer to continue, 0 for end : ");
        Scanner sys = new Scanner(System.in);
        int val = sys.nextInt();
        int temp = val;

        while (val != 0) {
            System.out.print("put Integer to continue, 0 for end : ");
            val = sys.nextInt();
            temp = temp + val;
        }
        System.out.println("Total sum of your inputs: " + temp);

//        for (int i = 0; i >= 0; i++) {
//            if (val >= 0) {
//                System.out.println("positive value to sum, put negative value to end");
//
//                val = sys.nextInt();
//                temp = temp + val;
//                System.out.println("Sum of total values is : " + temp);
//
//            } else {
//
//                break;
//            }
//
//        }
    }

    public static void main(String[] args) {
        oddInt();
    }

}
