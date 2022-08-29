package JavaCollections;

import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorJava {

    /*
     ======================Key points about Vector:==================
==> Vector is a legacy class
==> introduced in Java 1.0 version
==> all its method are synchronized i.e.; thread-safe for any operation
   ==> Vector is implementation class of List interface (i.e.; Vector implements List)
    ==> Vector uses resizable array or grow-able array to store element/objects
    ==> Duplicate element/objects are allowed to be inserted
    ==> Insertion order is maintained
    ==> Allows NULL insertion (no limit, any number of NULL insertion is allowed)
    ==> Without generics, Vector allows to insert any type of objects;
    ==> Elements retrieval is faster as Vector works on zero-based index
    ==> Manipulation (i.e.; addition/deletion of element from middle of Vector) is very slow, as it requires lot of shifting work internally
    ==> Note: this is exactly same as that of ArrayList except all methods of Vector class is synchronized. Hence, it is thread-safe
    ==> Present in java.util package and extends java.util.AbstractList implements java.util.List interface
    
    
3.1 Vector v = new Vector();
        //creates an empty Vector object of size 10
        //when maximum size of the Vector is reached, then new Vector of bigger size is created using below formula
        //Capacity = New Vector size = 2 * current size (double in size)
        //old Vector item values will be copied into new Vector
3.2 Vector v = new Vector(int initialCapacity);
        //creates an empty Vector object of specified size (or initial capacity)
        //when maximum size is reached, above formula will be applied and new ArryaList will be created
        //3.3 Vector v = new Vector(int initialCapacity, int incrementalCapacity);
        //creates an empty Vector object of specified size (or initial capacity)
        //when maximum size is reached, new vector is created with a size of (old vector size + increment capacity value)
3.4 Vector v = new Vector(Collection c);
        //creates an equivalent Vector object for the specified collection
        //it is basically used for inter-conversion between collection objects
        //    
    
    
    
    ======================Vector method=====================
    
void addElement(Object obj);  ==  add/inserts specified element/object at the end of the invoking vector
boolean removeElement(Object obj);  ==  removes first occurrence of specified element/object from the invoking vector
void removeElementAt(int index);  ==  removes element/object from the invoking vector at the specified index
void removeAllElements();  ==  removes all element/objects from the invoking vector (after removing all element/objects, size of vector will become zero)

Object elementAt(int index);  ==  returns element/object from the invoking vector at the specified index
Object firstElement();  ==  returns first element/object from the invoking vector
Object lastElement();  ==  returns last element/object from the invoking vector
int size();  ==  returns number of elements present in the invoking vector (at the time of invoking)
 int capacity();  ==  returns current capacity of the invoking vector
Enumeration elements();  ==  returns Enumeration of the elements in the invoking vector
    

     */
    public static void main(String[] args) {
        // Here in this we can declare the size of vector list
        //if we declare length in the vector then if the length overflows then the length will be increased by geomatically. means 2*2*2*2*2......n
        Vector<Integer> vc = new Vector(2);
       
        
        vc.addElement(15);
        vc.addElement(10);
        System.out.println("the exact length position is : " + vc.capacity());

        vc.addElement(5);
        System.out.println("Overflows and the length becomes changed into : " + vc.capacity());
        vc.addElement(3);
        vc.addElement(3);
        System.out.println( "The sizze of the Vector is : "+vc.size());
        System.out.println("Overflows and the length becomes changed into : " + vc.capacity());

        
        //another constructor, where we will fix the value on which if the length overflows then the capasity will be increased.
        Vector<Integer> vc1 = new Vector(2,2);
        vc1.addElement(15);
        vc1.addElement(10);
        System.out.println("the exact length size is : " + vc1.size());
        System.out.println("the exact length position is : " + vc1.capacity());
        vc1.addElement(10);
        System.out.println( "The sizze of the Vector is : "+vc1.size());
        System.out.println("Overflows and the length becomes changed into : " + vc1.capacity());
       
        

    }

}
