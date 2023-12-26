package week_12.assignments.question_12_05;

public class Test_12_05 {
    public static void main(String[] args) throws IllegalTriangleException {

        Triangle_12 triangle1 = new Triangle_12();
        System.out.println(triangle1.toString());
        System.out.println("Perimeter of triangle is: " + triangle1.getPerimeter() + "\nArea of triangle is: " + triangle1.getArea());
    }
}