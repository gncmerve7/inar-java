package week_10.assignments.question_10_02;

public class Bmi {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public Bmi(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        double bmi = weight * KILOGRAMS_PER_POUND /
                ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus() {
        double bmi = getBmi();
        if (bmi < 18.5) {
            return "Name: " + getName() + "\nBMI: " + getBmi() + " Underweight";
        } else if (bmi < 25) {
            return "Name: " + getName() + "\nBMI: " + getBmi() + " Normal";
        } else if (bmi < 30) {
            return "Name: " + getName() + "\nBMI: " + getBmi() + " Overweight";
        } else {
            return "Name: " + getName() + "\nBMI: " + getBmi() + " Obese";
        }
    }
}
