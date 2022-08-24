package JavaCollections;
import java.util.*;

public class deQueueorDoubleEndedQueue {
    
    //Deque is a double ended que. we can add or delete value from both end. 
    
    public static void main(String[] args) {
      ArrayDeque dq = new ArrayDeque();
      
      dq.add(15);
      dq.add(20);
      dq.add(25);
      dq.add(30);
      dq.addFirst(500);
      dq.addLast(400);
      
        for (Iterator iterator = dq.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(next);
            
        }
      
        
        
    }
    
}
