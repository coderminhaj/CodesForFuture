package OtherTopics;

class detailsOfEnum{
     /*
    
   ================ Points to remember for Java Enum===============
==> Enum improves type safety
==> Enum can be easily used in switch
==> Enum can be traversed
==> Enum can have fields, constructors and methods
==> Enum may implement many interfaces but cannot extend any class because it internally extends Enum class
    
    
    
    
    ================================Defination of enum=============================
    
    Enumerations was added to Java language in JDK5. Enumeration means a list of named constant. In Java, enumeration defines a class type. An Enumeration can have constructors, methods and instance variables. It is created using enum keyword. Each enumeration constant is public, static and final by default. Even though enumeration defines a class type and have constructors, you do not instantiate an enum using new. Enumeration variables are used and declared in much a same way as you do a primitive variable.
    
    w3school
    -----------
    An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:
    
    Java TPoint
   https://www.javatpoint.com/enum-in-java
    ======================Details about Enum ==========================
   ==>  It can be used for days of the week (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, and SATURDAY) , directions (NORTH, SOUTH, EAST, and WEST), season (SPRING, SUMMER, WINTER, and AUTUMN or FALL), colors (RED, YELLOW, BLUE, GREEN, WHITE, and BLACK) etc. 
    ==> According to the Java naming conventions, we should have all constants in capital letters. So, we have enum constants in capital letters.
    ==> Java Enums can be thought of as classes which have a fixed set of constants (a variable that does not change). The Java enum constants are static and final implicitly. It is available since JDK 1.5.
    
    ==> Enums are used to create our own data type like classes. The enum data type (also known as Enumerated Data Type) is used to define an enum in Java. Unlike C/C++, enum in Java is more powerful. Here, we can define an enum either inside the class or outside the class.
    
    ==> Java Enum internally inherits the Enum class, so it cannot inherit any other class, but it can implement many interfaces. We can have fields, constructors, methods, and main methods in Java enum.
  
    
    */
}

enum OutSideEnum{
    SATURDAY(10), SUNDAY(20), MONDAY(30);
    int values;

    private OutSideEnum(int values) {
        this.values = values;
    }
    
}


public class EnumInJava {
    
    //Enum Can Be declared Inside of any class
//enum is the keyword for starting enum, enum is like a special type of class.
enum enumexa{
    //All The constants should have in capital latter
    //All The constant is public, static and final by default
    //All the constants are stored by the indexed position
    JAN,FEB,MAR,
    //for initializing the value with the declaration should use this mechanism:
    APR,MAY,JUN;
}
   
    
    
    
    public static void main(String[] args) {
        //Accessing Constant from the outside of any class
        //Need to findout the printing solution
//        OutSideEnum ou = OutSideEnum.MONDAY.values;
        OutSideEnum oe = OutSideEnum.SATURDAY;
//        System.out.println(ou);
        
        
        for (OutSideEnum r : OutSideEnum.values()) {
            System.out.println(r + " " + r.values);
        }
        
        
        //====================EnumInJava : Start ===================
        //Direct Accessing the Constant
        enumexa obj1 = enumexa.APR;
        enumexa obj = enumexa.APR.JAN;
        System.out.println(obj);

        //for knowing the length of values, means how much values are there.
        System.out.println(enumexa.values().length);
        
        System.out.print("ValueOF : ");
        System.out.println(enumexa.valueOf("JAN"));
        //ordinal will provide the index position of the constant
        System.out.print("Ordinal of  index postion of APR : ");
        System.out.println(enumexa.APR.ordinal());
        //ordinal will provide the index position of the constant
        System.out.print("Ordinal of  index postion of MAY : ");
        System.out.println(enumexa.MAY.ordinal());
        //Accessing Enum values:
        for (enumexa arg : enumexa.values()) {
            System.out.print(arg + ", ");
            
        }
        //====================EnumInJava : Start ===================
        
    }
    
}
