
package examprep;

import java.util.*;



public class primeNumber {
    


    static void isPrime(int val){
        boolean flag = false;
        if (val <= 1){
            System.out.println("0,1 or any negative integer is not a prime number");
            return;
        }else if(val == 2){
            System.out.println( val +" is a prime Number");
            return;
        }else if (val>2){
            for(int i = 2; i<val; i++){
                if (val % i == 0){
                    flag = true;
                    break;
                }
            }
        }
        
        if (flag == true){
            System.out.println( val +" is not a prime number");
        }else{
            System.out.println(val +" is a prime Number");
        }
  
    }
    
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.print("Please Put Your Value For Checking Prime Number : ");
        isPrime(sys.nextInt());
    }
    
}
