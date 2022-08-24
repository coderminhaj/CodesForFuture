package examprep;

public class greatestCommonInteger {

    static void greatestComInt(int val1, int val2) {
        int gcd = 35;

        for (int i = 2; i < val1 && i < val2; i++) {
            if (val1 % i == 0 && val2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The greatest common int is: " + gcd);

    }

    public static void main(String[] args) {
        greatestComInt(35, 15);

    }
}
