package LogicalFunctions;

public class primeNumberWithSpecification {
    // Prime number method 2

    public static void main(String[] args) {

        int temp = 0;

        for (int st = 2; st < 15; st++) {
            // we can use (int i = 2; i <= num-1 ; i++) or (int i = 2; i < num ; i++) both are same
            for (int i = 2; i <= st -1; i++) {
                if (st % i == 0) {
                    temp++;

                }
            }

            if (temp == 0) {
                System.out.println(st + " is a prime number");
            }else{
                temp = 0;
            }

        }
    }
}
