package week_06.assignments;

public class Question_06_08 {
    public static void main(String[] args) {
        System.out.printf("%-14s %14s %9s %18s %14s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
        System.out.println("------------------------------------------------------------------------------");
        for(double i=40,j=120;i>=31&&j>=30;i--,j-=10)

        System.out.printf("%-14f %13.1f %10s %15.1f %14.2f\n",i,convertToFahrenheit(i),"|",j,convertToCelsius(j));
    }

    public static double convertToFahrenheit(double celsius) {

        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double convertToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }


}
