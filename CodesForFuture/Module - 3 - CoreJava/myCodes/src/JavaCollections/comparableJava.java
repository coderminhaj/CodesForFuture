package JavaCollections;

import java.util.*;

public class comparableJava implements Comparable<comparableJava> {

    /*
   =========== Comparable interface:===========
   ==> Comparable interface is used to order objects of each class that implements it
   ==> This is part of original collection framework introduced in Java 1.2 version
   ==> Present in java.lang package
   ==> Contains only one method compareTo() which returns integer value
    ==> We can reverse natural sorting-order by overriding compareTo() method and coding our own logic
    ==> Collection classes like TreeSet & TreeMap uses compareTo() method to sort elements before storing
    
    
    ==> Based on the integer value returned by compareTo(object2) method, elements are stored/sorted,
            1. returns negative integer, if object1 less than object2 (object1 < object2)
            2. returns positive integer, if object1 greater than object2 (object1 > object2)
            3. returns Zero (0), if object1 is equal to object2 (object1 == object2)

    
    
    
     */

    String name;
    int age;
    int roll;

    public comparableJava(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    @Override
    public int compareTo(comparableJava com) {
        if (this.age == com.age) {
            return 0;

        } else if (this.age < com.age) {
            return -1;
        } else {
            return 1;
        }
    }

}

class testing {

    public static void main(String[] args) {
        List<comparableJava> lis = new ArrayList<>();
        lis.add(new comparableJava("minhaj", 50, 10));
        lis.add(new comparableJava("Rahat", 40, 50));
        lis.add(new comparableJava("Nazmul", 20, 30));
        lis.add(new comparableJava("Jahid", 40, 5));
        lis.add(new comparableJava("Rasel", 70, 40));

        Collections.sort(lis);

        for (Iterator<comparableJava> iterator = lis.iterator(); iterator.hasNext();) {
            comparableJava next = iterator.next();
            System.out.println(next.age);

        }

    }

}
