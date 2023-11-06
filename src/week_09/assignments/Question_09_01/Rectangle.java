package week_09.assignments.Question_09_01;

public class Rectangle {
    private double width;
    private double height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return (2 * (width + height));

    }

    public double getArea() {
        return width * height;
    }

}
