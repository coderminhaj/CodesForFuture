package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Loops {
    
    
    public static void main(String[] args) {
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        

        System.out.println("For Loop");
        for(int i = 0; i<list2.size();i++){
            System.out.println(list2.get(i));
        }System.out.println();
        
        
        //for Each loop the syntax is for(var/datatype/classname/object name nameofelement: object)
        System.out.println("For Each Loop with Var Keyword");
        for(var li:list2){
            System.out.println(li);
        }System.out.println();
        
        System.out.println("For Each Loop With Datatype, classtype, object");
        for(Integer li:list2){
            System.out.println(li);
        }System.out.println();
        
        
        
        
        
        
 
        System.out.println("Iterator with While loop");
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
            
        }System.out.println();
        
        
        System.out.println("ListIterator with while loop");
        //it has the previos option also
        ListIterator itl = list2.listIterator();
        while (itl.hasNext()) {
            Object nextl = itl.next();
            System.out.println(nextl);
            
        }System.out.println();
        
        
         System.out.println("ListIterator with For loop");
        //listIterator or litarator in for loop
        for(ListIterator it2 = list2.listIterator(); it2.hasNext();){
            System.out.println(it2.next());
            
        }System.out.println("");
        
        System.out.println("Manytypes of expression loop");
        System.out.println("lamda expression");
        list2.forEach(n -> System.out.println(n));
        System.out.println("with method");
        list2.forEach(n -> show(n));
        System.out.println("another expression");
        list2.forEach(System.out::println);
        
    }
    
    public static void show(int n){
        if (n>40){
            System.out.println(n);
        }
    }
    
}
