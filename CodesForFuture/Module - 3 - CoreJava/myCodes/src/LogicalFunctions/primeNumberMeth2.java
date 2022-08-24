package examprep;

import java.util.*;

public class primeNumberMeth2 {
    // Prime number method 2

    public static void main(String[] args) {
        int num = 15;
        int temp = 0;

        // we can use (int i = 2; i <= num-1 ; i++) or (int i = 2; i < num ; i++) both are same
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                temp++;

            }
        }

        if (num < 2) {
            System.out.println("0, 1 or negative integer is not a prime number");
        } else if (temp == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }

    }

}
