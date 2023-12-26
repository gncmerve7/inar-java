package week_13.assignments.question_13_01;

abstract class GeometricObject13 {
    boolean filled;
    String color;

    GeometricObject13(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public String toString() {
        return "color: " + color + " and filled: " + filled;

    }
}