// supporting files for Main
package pr1;

public class pr1_circle extends pr1_geometric {
    double radius;

    pr1_circle() {
        this.radius = 10;
    }

    pr1_circle(double radius) {
        this.radius = radius;
    }

    pr1_circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.isfilled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * getRadius();
    }

    public double getArea() {
        return 3.14 * getRadius() * getRadius();
    }

    public double getPerameter() {
        return 2 * 3.14 * getRadius();
    }
}
