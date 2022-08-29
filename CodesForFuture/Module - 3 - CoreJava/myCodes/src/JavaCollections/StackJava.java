package JavaCollections;

import java.util.Stack;

public class StackJava {
    /*
    =============Key points about Stack:===========
==> Stack is a legacy class
==> introduced in Java 1.0 version
==> works in Last-In First-Out order (LIFO order)
==> most of its methods are synchronized i.e.; thread-safe
==> Stack is a sub-class of Vector (i.e.; Stack extends Vector)
==> All properties are same as that of Vector class
==> Its data structure is designed in such a way that elements added last to the Stack will be returned first
==> That is, it follows Last-In First-Out order
==> Present in java.util package and extends java.util.Vector class
    
    ====================Stack constructors:=========================
Stack s = new Stack();
Stack defines default constructor which creates an empty Stack object
    
    
    ====================Stack methods:==============================
Stack specific methods
 Stack methods	Description
Object push(Object obj); ==== add/inserts new element/object into stack
Object pop(); ==== removes and return top of the stack
Object peek(); ==== returns top of the stack (just returns but doesn’t remove unlike pop() operation
boolean empty(); ==== check whether invoking stack is empty or not returns true, if stack is empty; otherwise, false
int search(Object obj) ==== searches specified element/object from invoking stack (returns offset from top of the stack, if element is available; otherwise returns -1, if element not available)
    
    
    */
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(15);
        st.push(20);
        st.push(10);
        st.push(5);
        System.out.println(st);
        
        //it follows Last-In First-Out order
        st.pop();
        System.out.println(st);
        
        System.out.println(st.peek());
        System.out.println(st.empty());
        System.out.println(st.search(20));
        
        
    }
}
