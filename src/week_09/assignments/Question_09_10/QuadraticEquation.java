package week_09.assignments.Question_09_10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }//ax^2+bx+x=0

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        } else
            return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        } else
            return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public String displayRoots() {
        if (getDiscriminant() > 0) {

            return "The equation has two roots " + getRoot1() + " and " + getRoot2();
        }
        if (getDiscriminant() == 0) {
            return "The equation has one root " + getRoot1();
        }
        return "The equation has no roots.";
    }
}
