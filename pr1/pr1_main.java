// Name : Vansjadiya Jeet Rajeshbhai
// ID : 21CE149

// Create an abstract class GeometricObject as the superclass for Circle and
// Rectangle. GeometricObject models common features of geometric
// objects. Both Circle and Rectangle contain the getArea() and
// getPerimeter() methods for computing the area and perimeter of a circle
// and a rectangle. Since you can compute areas and perimeters for all
// geometric objects, so define the getArea() and getPerimeter() methods in
// the GeometricObject class. Give implementation in the specific type of
// geometric object. Create TestGeometricObject class to display area and
// perimeter of Rectangle and Triangle, compare area of both and display
// results. Design of all classes are given in the following UML diagram.

package pr1;

public class pr1_main {
    public static void main(String[] args) {
        pr1_circle c = new pr1_circle(1);
        System.out.println("Information of Circle");
        System.out.println("Area of Circle is:" + c.getArea());
        System.out.println("Perameter of Circle is:" + c.getPerameter());

        pr1_rect r = new pr1_rect(10, 20);
        System.out.println("Information of Rectangle");
        System.out.println("Area of Rectangle is:" + r.getArea());
        System.out.println("Perameter of Rectangle is:" + r.getPerameter());

        System.out.println("\n THIS PROGRAM IS PREPARED BY 21CE149_Jeet ");
    }
}
