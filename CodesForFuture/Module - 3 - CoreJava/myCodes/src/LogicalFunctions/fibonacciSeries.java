
package examprep;
import java.util.*;


public class fibonacciSeries {
    static Scanner sys = new Scanner(System.in);
    
    
    
    static void isFibonnacci(int val){
        int a = 0;
        int b = 1;
        int temp = 0;
        
        if (val <= 1){
            System.out.println("Invalid Input");
        }else if (val >1){
            for (int i = 0; i<val; i++){  
                a = b;
                b = temp;
                temp = a+ b;
                
               
            }
        } System.out.println("Fibonacci Series For " + val + " is : " +temp);
        
    }


    public static void main(String[] args) {
        System.out.print("Please Put Your input for Fibonacci Series: ");
        isFibonnacci(sys.nextInt());
    }
    
}
