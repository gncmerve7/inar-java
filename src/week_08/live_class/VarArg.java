package week_08.live_class;

public class VarArg {
    public static void main(String[] args) {
        int arr[]= {3,5,1,5};
        System.out.println(last(3,5,1,8,6,9,10));
        System.out.println(first(arr));
    }
    public static int first(int arr[]){
        return arr[0];
    }

    public static int last(int ... arr){
        return arr[arr.length-1];
    }
}
