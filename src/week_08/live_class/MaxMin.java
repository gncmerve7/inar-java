package week_08.live_class;

public class MaxMin {
    public static void main(String[] args) {

       int[][] arr2 = {  {1,2,3,4}, {5,600} , {7,8,601,9}, {10,11,12},  {13,14,15, 16, 17}  };

        int max = arr2[0][0];
        int min = arr2[0][0];

        for(int i = 0; i <= arr2.length-1; i++  ){
            int[] arr1 = arr2[i];
            for(int j =0; j <= arr1.length-1; j++ ){
                int temp = arr1[j];
                if(temp > max){
                    max = temp;
                }
                if(temp < min){
                    min = temp;
                }
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
