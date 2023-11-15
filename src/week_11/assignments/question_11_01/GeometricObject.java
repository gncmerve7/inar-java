package week_11.assignments.question_11_01;

public class GeometricObject {
    String color;
    boolean filled;

    GeometricObject() {
        this.color = "yellow";
        this.filled = false;
    }

    public double getArea() {

        return 3;
    }


    public double getPerimeter() {
        return 0;
    }

    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String toString() {

        return "The color is: " + color +
                "\nTriangle  is: " + ((filled) ? "filled" : "empty");
    }
}

