package week_09.assignments.Question_09_01;

public class Test01 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(40, 4);
        Rectangle rec2 = new Rectangle(35.9, 3.5);

        System.out.println("---Rectangle 1---");
        System.out.println("Width: " + rec1.getWidth());
        System.out.println("Height: " + rec1.getHeight());
        System.out.println("Area: " + rec1.getArea());
        System.out.println("Perimeter: " + rec1.getPerimeter());

        System.out.println("---Rectangle 2---");
        System.out.println("Width: " + rec2.getWidth());
        System.out.println("Height: " + rec2.getHeight());
        System.out.println("Area: " + rec2.getArea());
        System.out.println("Perimeter: " + rec2.getPerimeter());


    }
}
