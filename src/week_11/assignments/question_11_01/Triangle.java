package week_11.assignments.question_11_01;

public class Triangle extends GeometricObject {
    double side1;
    double side2;
    double side3;

    Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {

        System.out.println(super.toString());

        return "Triangle's side1=" + side1 + " side2=" + side2 + " side3=" + side3;
    }
}
