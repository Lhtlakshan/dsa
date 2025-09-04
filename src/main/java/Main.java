import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int length = arr.length;

        // normal one shift right an array
        int last = arr[length - 1];

        for(int i = length - 1; i > 0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = last;

        System.out.println(Arrays.toString(arr));

        shiftRight(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    //k th position right shift array

    public static void shiftRight(int[] arr, int k){
        k = k % arr.length;

        reverseArray(arr, 0, arr.length-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, arr.length-1);
    }

    public static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
