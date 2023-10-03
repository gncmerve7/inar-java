package week_07.live_class;

public class Array00 {
    public static void main(String[] args) {
        int[] array1 = new int[2];
        array1[0] = 1;
        array1[1] = 2;
        int[] array2 = new int[2];
        array2[0] = 3;
        array2[1] = 4;


        System.arraycopy(array1,0,array2,0,1);
        System.out.println("&&&&&&&&&");

        print(array1);
        System.out.println("********");
        print(array2);
        System.out.println("********");
        array2 = array1;
        print(array2);

    }

    public static void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
