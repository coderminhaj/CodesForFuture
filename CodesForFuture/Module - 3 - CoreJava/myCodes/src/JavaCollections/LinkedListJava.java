
package JavaCollections;
import java.util.LinkedList;

public class LinkedListJava {
    
    //same as ArrayList but it additionally supports the common Queue methods  like pick(),poll(),offer().
    
    public static void main(String[] args) {
        LinkedList linkl = new LinkedList();
        
        linkl.add(10);
        linkl.add("Minhaj");
        linkl.add("Minhaj");
        linkl.add(10);
        linkl.add(20);
        linkl.add(30);
        linkl.add(30);
        System.out.println(linkl.peek());
        System.out.println(linkl.poll());
        System.out.println(linkl.remove());

        
        for (int i = 0; i < linkl.size(); i++) {
            System.out.println(linkl.get(i));
        }
        
    }
    
    
}
