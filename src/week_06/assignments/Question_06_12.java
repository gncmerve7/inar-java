package week_06.assignments;

public class Question_06_12 {
    public static void main(String[] args) {
        System.out.println("Characters per 1 to Z: ");
        printChars('1', 'Z', 10);

    }

    public static void printChars(char ch1, char ch2, int numOfPerLine) {
        int count = 0;
        for (int i = (char) ch1; i <= (char) ch2; i++) {
            System.out.print((char) i + " ");
            count++;
            if (count % numOfPerLine == 0)
                System.out.println("");


        }
    }
}
