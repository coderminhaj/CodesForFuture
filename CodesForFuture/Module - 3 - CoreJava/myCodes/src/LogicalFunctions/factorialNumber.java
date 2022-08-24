package examprep;

import java.util.*;

public class factorialNumber {

    static void factorialNumber(int val) {
        int fact = 1;
        if (val <= 1) {
            System.out.println("Invalid Input");
        } else if (val > 1) {
            for (int i = 1; i <= val; i++) {
                fact = fact * i;
            }
            System.out.println("The Factoril value of " + val + " is : " + fact);

        }
    }

    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.print("Put your Input For Checking Factorial : ");
        factorialNumber(sys.nextInt());
    }
}
