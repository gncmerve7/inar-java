package week_12.assignments.questions_12_09;

public class BinaryFormatException extends NumberFormatException {

    BinaryFormatException(String str) {
        super(str);
    }

    public void printStackTrace() {
        System.out.println("It is not a binary string.");
    }
}
