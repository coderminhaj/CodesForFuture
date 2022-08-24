
package JavaCollections;

import java.util.NavigableSet;
import java.util.*;

public class NavigableSetJava {
    /* 
    =========Key points about NavigableSet:
==> NavigableSet doesn’t allow duplicate items
==> maintains sorting-order
    
    NavigableSet interface:
//    NavigableSet interface is a sub-interface of SortedSet interface (i.e.; NavigableSet extends SortedSet)
//    It allows only unique element/objects to be inserted
//    It stores element/objects in sorting-order
//    NavigableSet interface defines more specific methods for navigation purposes, in addition to inherited methods from Set/SortedSet/Collection interfaces
//    This is introduced in Java 1.6 version for navigation support
    
    
    NavigableSet interface methods:
    E floor(E e); == returns greatest/highest element which is less than or equal to specified element e
    E lower(E e); == returns greatest/highest element which is less than specified element e
    E ceiling(E e); == returns least/lowest element which is greater than or equal to specified element e
    E higher(E e); == returns least/lowest element which is greater than specified element e
    E pollFirst(); == remove & retrieve 1st element
    E pollLast(); == remove & retrieve last element
    
===========Example to understand method===========
NavigableSet = [10, 20, 30, 40, 50, 60, 70];
floor(30) = 30
lower(30) = 20
ceiling(40) = 40
higher(40) = 50
pollFirst() = 10
pollLast() = 70
descendingSet() = [70, 60, 50, 40, 30, 20, 10];
 
    
    */ 
    public static void main(String[] args) {
        NavigableSet ngset = new TreeSet();
        
        //maintaining sorting order
        ngset.add(10);
        ngset.add(20);
        ngset.add(30);
        //NavigableSet doesn’t allow duplicate items
        ngset.add(30);
        // Null Value Not Supported
//        ngset.add(null);
        ngset.add(40);
        ngset.add(50);
        
        
        
        System.out.println(ngset);
        System.out.println(ngset.lower(30));
        System.out.println(ngset.higher(30));
        System.out.println(ngset.pollFirst());
        System.out.println(ngset.pollLast());
    }
    
}
