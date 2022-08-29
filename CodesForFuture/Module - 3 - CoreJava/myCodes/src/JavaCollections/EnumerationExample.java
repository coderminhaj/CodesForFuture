package JavaCollections;
import java.util.*;
public class EnumerationExample {
    /*
    ===================Defination===============
    The Enumeration interface defines the methods by which you can enumerate (obtain one at a time) the elements in a collection of objects.

    What is enumeration?
In the process of enumeration, the elements of a collection are retrieved one by one.
    
    
    
    
    */
    
    
    
    
    
    public static void main(String[] args) {
          Vector<String> vec = new Vector<>();
        vec.addElement("Sundar Pichai");
        vec.addElement("Satya Nadella");
        vec.addElement("Shiv Nadar");
        vec.addElement("Shantanu Narayen");
        vec.addElement("Francisco D’Souza");
        Enumeration<String> e = vec.elements();
        Enumeration<String> e1 = Collections.enumeration(vec);
        System.out.println(e.nextElement());
        System.out.println(e1.nextElement());
          
    }
    
}
