package week_04.assignments;

public class Question_04_25 {
    public static void main(String[] args) {
        int plateNumber = (int) (Math.random() * (10000 - 1000));
        char firstLetter = (char) (int) ((Math.random() * (90 - 65)) + 65);
        char secondLetter = (char) (int) ((Math.random() * (90 - 65)) + 65);
        char thirdLetter = (char) (int) ((Math.random() * (90 - 65)) + 65);
        System.out.println("Generated Plate number is " + firstLetter + secondLetter + thirdLetter + plateNumber);
    }
}
