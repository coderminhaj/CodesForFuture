package JavaCollections;
import java.util.*;

class my implements Comparator<Integer>{

    @Override
    public int compare(Integer x, Integer y) {
         if(y>=x){
            return -1;
        }else if(x>y){
            return 1;
        }else{
            return 0;
        }
    }
    //comoparator should be used in a separate class.

    
}

public class comparatorInJava {
    
    public static void main(String[] args) {
        int a[] = {2,64,6,2,4,8,6,4663,5};
//        Arrays.sort(a);
       Collections.sort(a, new my());
        
        
        
        
        
        for (int i : a) {
            System.out.println(i);
        }
    }
    
}
