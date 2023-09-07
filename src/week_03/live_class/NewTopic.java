package week_03.live_class;

public class NewTopic {
    public static void main(String[] args) {


        System.out.println(3 == 3 && 9 < 3);
        System.out.println(3 == 3 && 2 < 3);
        System.out.println(3 == 3 || 9 < 3);
        System.out.println(3 == 3 || 2 < 3);


        System.out.println(!false);
        System.out.println(!((3 < 4 && "M" == "M") || 3.2 < 2.1));
        System.out.println(((3 < 4 && "M" == "M") || 3.2 < 2.1));

    }
}