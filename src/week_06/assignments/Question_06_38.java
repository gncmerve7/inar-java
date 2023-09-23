package week_06.assignments;

public class Question_06_38 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.print(getRandomUpperCaseLetter() + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        for (int i = 1; i <= 100; i++) {
            System.out.print(getRandomDigitCharacter() + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        char ch = (char) (Math.random() * (ch2 - ch1 + 1) + ch1);
        return ch;
    }

    public static char getRandomUpperCaseLetter() {
        char chUpper = getRandomCharacter('A', 'Z');
        return chUpper;
    }

    public static char getRandomDigitCharacter() {
        char chDigit = getRandomCharacter('0', '9');
        return chDigit;
    }
}
