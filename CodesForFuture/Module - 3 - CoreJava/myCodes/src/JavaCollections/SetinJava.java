
package JavaCollections;
import java.util.*;

public class SetinJava {
    /*
    Factors to consider while discussing any collection class
We should consider below factors while discussing any implementation class of collection framework or for that matter Map interface,

//Underlying data structure
//Duplicates are allowed or Not
//Insertion order is maintained or Not
//Whether NULL insertion is possible or Not
//If possible, how many NULL values can be inserted
//Whether collection class provide sorting, by default
//Is there any way to apply customized sorting
//Performance, while dealing with retrieval or manipulation (addition/deletion)
//By default, all methods are synchronized or Not
    
    
    Key points about SetinJava:
    ==> SetinJava doesn’t allow duplicate items
    ==> also doesn’t maintain insertion-order
    ==> While iterating through SetinJava, we will get items in random-order (as against insertion-order in List)
    ==> There are 2 direct concrete classes for SetinJava interface viz.; HashSet, LinkedHashSet 
    
    
*/
 
}

class hashSet{
    /* 
    Key points about HashSet:
    ==> HashSet contains only unique elements
    ==> It doesn’t maintains insertion-order or
    ==> say stores in random-order
    
    HashSet is the implementation class of SetinJava interface (i.e.; HashSet implements SetinJava)
    
// HashSet hs = new HashSet();
//creates an empty HashSet object of size 16
//with default fill ratio 0.75

*/
    public static void main(String[] args) {
        //both are same. if we put the sub object in the super class then we will get the access of super class's methods also.
    HashSet<Integer> hset = new HashSet<>();
    Set<Integer> hset1 = new HashSet<>();
    
    hset.add(15);
    hset.add(20);
    hset.add(10);
    //duplicate value is added but doesnt allow duplicate value
    hset.add(20);
    
    
        System.out.println(hset);
    
    }
    
    
}

class linkedhashset{
    public static void main(String[] args) {
        
    /*  Key points about LinkedHashSet:
      ==> LinkedHashSet is exactly same as that of HashSet
      ==>but it preserves insertion-order
        
        
//        LinkedHashSet uses combination of LinkedList & hashtable to store element/objects
//        Duplicate element/objects are NOT allowed
//        If duplicate value is added again and again, there won’t be any compile-time or runtime errors
//        At any time, LinkedHashSet contains only unique element/objects
//        Insertion-order is maintained
//        Allows NULL insertion but maximum of only one NULL value
//        Without generics, LinkedHashSet allows to insert any type of objects;
        
        
        ==> Fill ratio (or Load factor)
//Fill ratio is also known as Load factor
//This factor determines when to increase the size of LinkedHashSet automatically
//For example, for the 1st two constructors the default load factor is 75 –> which means after filling 75 % of LinkedHashSet, new LinkedHashSet of bigger size will be created
//For 3rd constructor, programmer can define load factor while creating LinkedHashSet object. If programmer define it to be 0.95, then after filling 95% of LinkedHashSet, size of LinkedHashSet will be increased automatically
//The value of Load factor should be in between 0 to 1.0
        
        
        
       =============== Difference between HashSet and LinkedHashSet ?==================
//The main difference between HashSet and LinkedHashSet is insertion-order
//HashSet doesn’t maintain insertion-order and print values in random-order while iterating
//whereas LinkedHashSet maintains insertion-order as seen in above example
//Note: All methods of HashSet/LinkedHashSet is non-synchronized
        
        

*/
    
    Set<Integer> lhset = new HashSet<>();
    //it preserves insertion-order
    lhset.add(50);
    lhset.add(20);
    lhset.add(30);
    //Allows NULL insertion but maximum of only one NULL value
    lhset.add(null);

    
    lhset.add(10);
    
        System.out.println(lhset);



        
    }
}
