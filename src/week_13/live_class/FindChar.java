package week_13.live_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) throws InputMismatchException {

        String name = "JAVA";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the index you want to get from name: ");
        int targetIndex = scan.nextInt();

        if (Character.isDigit(targetIndex)) {
            throw new InputMismatchException("Enter an integer");
        }

        try {

            System.out.println(name.charAt(targetIndex));

        } catch (InputMismatchException e) {
            System.out.println("Message from getMessage method : "
                    + e.getMessage());

        }


    }

}
