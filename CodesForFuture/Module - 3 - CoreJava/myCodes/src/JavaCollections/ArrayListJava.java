package JavaCollections;

import java.util.*;

public class ArrayListJava {
    
    public static void main(String[] args) {
        //As ArrayList is a class we can create direct object of ArrayList;
        //both works in the same way;
        ArrayList list1 = new ArrayList();
        //Using method for ArrayList Interface.
        
        list1.add(10);
        list1.add("Sting");
        list1.add(new ArrayList(List.of(15,478,65)));
//        System.out.println(list1.clone());
        
        
        
        
        
        //As List is an interface we cannot create a direct object of List Interface but we can create an object of subclass which is ArrayList.
        List list2 = new ArrayList();

        
        //Using method for List Interface.
        //As we are not declaring any generics or type safety we can add anything on the list. like, String, int, object, class object etc.
        list2.add(10);
        list2.add("Hello Sir");
        list2.add(new ArrayList(list1));
        list2.add(new ArrayListJava());
        //NULL insertion (no limit, we can insert any number of NULL to ArrayList)
        list2.add(null);
        
        list2.add("Position 2 Taken");
        //Clear method for clearing all the values from list
        //list1.clear();
        // Here I have added a complete list in another list. which will be merged with the list where i have used. like in list2 list1 value will be added. i have index position of list2 is 5 but when i added another list the items added and index position increased as the implemented list holds.
        list2.addAll(list1);
//        System.out.println(list2.get(7));

        //contains will check if the element is available or not? if it contains the value or element will return true, if not return false.  
        System.out.println(list2.contains(12));

        //we can pass another list also to check if the list value is available on there or not.
        System.out.println(list2.contains(list1));

        //Will return the indext position of the element.
        System.out.println(list2.indexOf(10)); 

        //For replacing the current value and setting a new value should use set method. (index postion in the list, reaplaccing value).
        list2.set(0, 50);
        
        //it will keep all the matched value from the list1 but will remove the unmatched value from list2.
//        list2.retainAll(list1);

        //will return the size of the elements in the list. like array length.
        list2.size();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
