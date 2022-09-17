// Name : Vansjadiya Jeet Rajeshbhai
// ID : 21CE149

// Write a program that illustrates the significance of interface default method.

package pr7;
import java.util.*;

interface TestInterface { // methods in java public void square(int a); // abstract method
default void show() { // default method System.out.println("Default Method Executed");
}
}

class pr_7 implements TestInterface{
// implementation of square abstract method 
public void square(int a) {
    System.out.println(a*a);
}

public static void main(String args[]) {
     pr_7 p = new pr_7(); 
     p.square(4);
     p.show(); // default method executed 
System.out.println(" THIS PROGRAM IS PREPARED BY21CE149_Jeet ");
}

}