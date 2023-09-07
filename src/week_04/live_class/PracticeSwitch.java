package week_04.live_class;

import java.util.Scanner;

public class PracticeSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for Monday 2 for Tuesday and ..!");
        int day=input.nextInt();
                /*   if (day==1||day==2||day==3)||(day==4)||(day==5) {   equal if(1<=day &&day<=5)
                             System.out.println("weekday");
                                 }else if(day==6||day==7){              bu gosterim yerine switch kullaniyoruuz
                                         System.out.println("weekend") }*/
        switch(day){
            case 1:
                System.out.println("weekday");
                break;
            case 2:
                System.out.println("weekday");
                break;
            case 3:
                System.out.println("weekday");
                break;
            case 4:
                System.out.println("weekday");
                break;
            case 5:
                System.out.println("weekday");
                break;
            case 6:
                System.out.println("weekend");
                break;
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
