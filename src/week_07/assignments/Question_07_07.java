package week_07.assignments;

public class Question_07_07 {

    public static void main(String[] args) {
        int arr[] = new int[100];
        count(arr);
    }

    public static int count(int arr[]) {
        int count[] = new int[10];
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            count[arr[i] % 10]++;
            System.out.println(i + "* The number: " + (arr[i]) + " Occurrence of number " + arr[i] + " is: " + count[arr[i] % 10]);
        }
        for (i = 0; i < count.length; i++) {
            arr[i] = i;
            System.out.println(i + "* The occurrence of number " + arr[i] + " is: " + count[arr[i] % 10]);
        }
        return count[arr[i]];
    }
}


