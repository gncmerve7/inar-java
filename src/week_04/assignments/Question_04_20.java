package week_04.assignments;

import java.util.Scanner;

public class Question_04_20 {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: " );
        String word=input.nextLine();
        int lengthOfWord=word.length();
        char firstIntex=word.charAt(0);
        System.out.println("Length of the string: "+lengthOfWord);
        System.out.println("First character of the string: "+firstIntex);

    }
}
