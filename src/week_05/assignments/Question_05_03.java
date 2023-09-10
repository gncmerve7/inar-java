package week_05.assignments;

public class Question_05_03 {
    public static void main(String[] args) {

        System.out.println(" Kilograms" + "\t\tPounds");
            for (int i = 1; i <= 199; i += 2) {
             double kilogramPerPound = i * 2.2;
            System.out.println(" " + i + "  " + "\t\t\t" + (kilogramPerPound * 100) / 100);
        }
    }
}
