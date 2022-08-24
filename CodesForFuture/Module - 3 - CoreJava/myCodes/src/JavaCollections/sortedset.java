
package JavaCollections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {
    
    /* 
    ==========Key points about SortedSet:
==> SortedSet doesn’t allow duplicate items
==> maintains sorting-order
    
//    SortedSet interface:
//    SortedSet interface is a sub-interface of Set interface (i.e.; SortedSet extends Set)
//    SortedSet allows only unique element/objects to be inserted
//    SortedSet stores element/objects in sorting-order
//    SortedSet interface defines 6 specific methods in addition to inherited methods from Set/Collection interface
    
    SortedSet interface methods:
//    Object first(); == returns 1st element of invoking Set
//    Object last(); == returns last element of invoking Set
//    SortedSet headSet(Object obj); == returns SortedSet, whose elements are less than specified object obj
//    SortedSet tailSet(Object obj); == returns SortedSet, whose elements are greater than or equal to specified object obj
//    SortedSet subSet(Object obj1, Object obj2); ==  returns SortedSet, whose elements range is starting from obj1 to obj2-1
//    Comparator comparator(); == returns SortedSet’s comparator object
    
    ===========Example to understand SortedSet specific methods:===========
SortedSet = [10, 20, 30, 40, 50, 60, 70];
first() = 10
last() = 70
headSet(40) =[10, 20, 30]
tailSet(40) =[40, 50, 60, 70]
subSet(20, 70) =[20, 30, 40, 50, 60]
comparator() = null; as it uses default natural sorting-order
    

    */
    
    public static void main(String[] args) {
        SortedSet sset = new TreeSet();
        
        sset.add(40);
        sset.add(60);
        sset.add(50);
        //Null value is not accepted here
//        sset.add(null);
        sset.add(10);
        //SortedSet doesn’t allow duplicate items
        sset.add(50);
        
        System.out.println(sset);
        System.out.println(sset.first());
        System.out.println(sset.last());
        //will not show the value we provided on the argument for the headset but before it all value will be showed.
        System.out.println(sset.headSet(50));
        //here all the values after the argumented value will be shown including the argument value itself
        System.out.println(sset.tailSet(50));
        
        
        
        
    }
    
}
