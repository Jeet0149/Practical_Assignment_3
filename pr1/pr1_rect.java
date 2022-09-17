package pr1;

public class pr1_rect extends pr1_geometric {
    double width;
    double height;

    pr1_rect() {
        this.width = 5;
        this.height = 10;
    }

    pr1_rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    pr1_rect(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.isfilled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerameter() {
        return 2 * (getHeight() + getWidth());
    }
}
