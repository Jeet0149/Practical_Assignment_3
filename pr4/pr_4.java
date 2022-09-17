// Name : Vansjadiya Jeet Rajeshbhai
// ID : 21CE149
// Develop a Program that illustrate method overridingconcept.
package pr4;

class Parent {
    protected void m2() {
        System.out.println("From parent m2()");
    }
}

class Child extends Parent {
    @Override // overriding method
    public void m2() {
        System.out.println("From child m2()");
    }
}

public class pr_4 {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.m2();
        Parent obj2 = new Child();
        obj2.m2();
        System.out.println(" THIS PROGRAM IS PREPARED BY 21CE149_Jeet ");
    }
}
