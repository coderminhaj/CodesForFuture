
package LogicalFunctions;

import java.util.Arrays;


public class randomNumber {
    public static void main(String[] args) {
       int[] arr = new int[10];
       
    for (int i = 0; i<arr.length; i++ ){
           double rand =(int) Math.round(Math.random()*100);
           arr[i] =(int) rand;
           for (int j = i + 1; j<arr.length;j++){
               if (arr[i] == arr[j]){
                   arr[j] =(int) rand;
               }
           }
        }
    
    for (int m = 0; m<arr.length; m++){
        System.out.println("The Random Numbers For " + m+ " position is : "+arr[m]);
    }
        System.out.println("Your random Numbers are: ");
       System.out.println(Arrays.toString(arr)); 
    }
    
}
