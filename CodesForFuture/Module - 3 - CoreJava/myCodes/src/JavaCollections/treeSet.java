
package JavaCollections;

import java.util.TreeSet;

public class treeSet {
    /* 
    =========Key points about TreeSet:==========
==> TreeSet doesn’t allow duplicate items
==> maintains ascending sorting-order, by default
    
    
    
    ==================TreeSet:======================
//    TreeSet is the implementation class of NavigableSet interface (i.e.; TreeSet implements NavigableSet)
//    TreeSet uses balanced-tree to store element/objects
//    Duplicate element/objects are NOT allowed
//    If duplicate value is added again, then there won’t be any compile-time or runtime errors
//    Insertion-order is NOT maintained
//    But TreeSet stores element/objects in sorting-order; it could be either default natural sorting order or programmer defined customized sorting-order
//    Allows NULL insertion but maximum of only one NULL value (till Java 1.6 version) But for updated version null value is not allowed

    
    */
    
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();
        TreeSet<String> tsetS = new TreeSet<>();
        
        tset.add(50);
        
//        tset.add(null);
       //    Allows NULL insertion but maximum of only one NULL value (till Java 1.6 version) But for updated version null value is not allowed
//        tset.add(null);
        tset.add(40);
        //Duplicate element/objects are NOT allowed
        tset.add(40);
        tset.add(30);
        tset.add(20);
        tset.add(10);
        tset.add(5);
        tset.add(4);
        
        
        //    Insertion-order is NOT maintained
//    But TreeSet stores element/objects in sorting-order; it could be either default natural sorting order or programmer defined customized sorting-order
        System.out.println(tset);
        
        
        tsetS.add("Abul");
        tsetS.add("Babul");
        tsetS.add("jaed");
        tsetS.add("Soniya");
        tsetS.add("Rana");
        System.out.println(tsetS);
        System.out.println(tsetS.first());
        System.out.println(tsetS.tailSet("Babul"));
        System.out.println(tsetS.headSet("Soniya"));
        System.out.println(tsetS.subSet("Babul" , "jaed"));
        
        
        
    }
    
    
}
