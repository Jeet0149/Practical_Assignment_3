// supporting files for Main

package pr1;

abstract class pr1_geometric {
    String color;
    boolean isfilled;
    java.util.Date datecreated;

    protected pr1_geometric() {
        this.color = "red";
    }

    protected pr1_geometric(String color, boolean filled) {
        this.color = color;
        this.isfilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isfilled;
    }

    public void setFilled(boolean filled) {
        this.isfilled = filled;
    }

    public java.util.Date getDatecreated() {
        return datecreated;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    abstract double getArea();

    abstract double getPerameter();
}
