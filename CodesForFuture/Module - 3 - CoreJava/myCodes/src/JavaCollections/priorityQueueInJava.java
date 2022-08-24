package JavaCollections;
import java.util.*;
import static java.util.Collections.list;

public class priorityQueueInJava {
    
    public static void main(String[] args) {
        /*==> PriorityQueue is a sub-class of AbstractQueue abstract class (i.e.; PriorityQueue extends AbstractQueue)
        ==> This priority can be natural-ordering or comparator provided customized-sorting
        ==>Insertion-order is NOT maintained
        
        
        
        
        */
        
 
        //Queue are two kinds: 1. Queue or Priority Queue 2. Dequeue or Double Ended Queue.
        PriorityQueue<Integer> pq = new PriorityQueue();
        
        //in priority que add or remove will automatically maintain the sequence. 
        
        pq.add(50);
        pq.add(60);
        pq.add(20);
        pq.add(20);
        pq.add(10);
        //element is also work as peek() or picking and retrieving the head element
        System.out.println("element "+pq.element());
        
        //NULL insertion is NOT allowed otherwise we wil get Null Pointer Exception exception
//        pq.add(null);
        
        pq.add(100);
        pq.forEach(n -> System.out.println(n));
        System.out.println("");

//        pq.peek();
//        pq.poll(); 
//        pq.remove();
//        pq.remove();
//        pq.remove();
 
        pq.forEach(n -> System.out.println(n));
        

        
    }
    
}
