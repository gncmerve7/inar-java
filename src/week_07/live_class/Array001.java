package week_07.live_class;

public class Array001 {
    public static void main(String[] args) {
        int [] array= new int[2];
        array[0]=1;
        array[1]=2;
    } public static void swap(int[] array){
        int temp=array[0];
        array[0]=array[1];
        array[1]=temp;

    }
    public static void print(int [] array){
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
