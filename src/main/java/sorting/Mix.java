package sorting;

import java.util.Arrays;

public class Mix {
    public static void main(String[] args) {
        int[] arr = {5,10,2,3,9};
        //bubble(arr);
        //selection(arr);
        //insertion(arr);
        arr = merge(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j+1] < arr[j]){
                    swap(arr, j,j+1);
                }
            }
        }
    }

    public static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {

            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }

    public static void insertion(int[] arr){
        for (int i=1; i<arr.length; i++){
            int key = arr[i];

            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }

    //merge sort
    public static int[] merge(int[] arr) {

        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length /2;

        int[] left = merge(Arrays.copyOfRange(arr, 0,mid));
        int[] right = merge(Arrays.copyOfRange(arr,mid, arr.length));

        return mergeArrays(left,right);
    }

    private static int[] mergeArrays(int[] left, int[] right) {
        int[] merge = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while(i< left.length && j < right.length){
            if(left[i] < right[j]){
                merge[k] = left[i];
                i++;
            }else{
                merge[k] = right[j];
                j++;
            }
            k++;
        }

        while(i< left.length){
            merge[k] = left[i];
            i++;
            k++;
        }

        while(j< right.length){
            merge[k] = right[j];
            j++;
            k++;
        }

        return merge;
    }

}
