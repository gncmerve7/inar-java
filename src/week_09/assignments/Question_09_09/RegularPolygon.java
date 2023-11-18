package week_09.assignments.Question_09_09;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

   public RegularPolygon(int n, double side) {

        this.n = n;
        this.side = side;
    }

    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX(double x) {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getPerimeter() {
        return side * n;
    }

    public double getArea() {
        return ((n * side * side) / (4 * Math.tan((Math.PI) / n)));


    }
}
