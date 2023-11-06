package week_09.assignments.question_09_09;

public class Test09 {
    public static void main(String[] args) {
        RegularPolygon first = new RegularPolygon();
        RegularPolygon second = new RegularPolygon(6, 4);
        RegularPolygon third = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("First RegularPolygon perimeter is : " + first.getPerimeter() + " area is " + first.getArea());
        System.out.println("Second RegularPolygon perimeter is : " + second.getPerimeter() + " area is " + second.getArea());
        System.out.println("Third RegularPolygon perimeter is : " + third.getPerimeter() + " area is " + third.getArea());
    }
}
