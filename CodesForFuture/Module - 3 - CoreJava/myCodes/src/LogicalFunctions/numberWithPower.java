
package examprep;

import java.util.Scanner;

public class numberWithPower {
    
    static void numWithPow(){
        Scanner sys = new Scanner(System.in);
        
        System.out.println("Put your Number: ");
        int num = sys.nextInt();
        
        System.out.println("Put your Power: ");
        int pow = sys.nextInt();
        
        int temp = 1;
        
        
        for(int i = 0; i<pow; i++){
            temp*=num;
        }
        
        System.out.println("The Calculation is: "+temp);
    }
    public static void main(String[] args) {
        numWithPow();
    }
    
    
}
