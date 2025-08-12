package sorting;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int[] arr = {2,300,40,6,23,20};
        int[] arr2 = {1,90,34,12,23};
        selectionSortInOne(arr2);
        System.out.println(Arrays.toString(arr2));


//        selectionSort(arr);
//
//        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i=0;i < arr.length; i++){
            int last = arr.length - i - 1  ;
            int max = maxIndex(arr, 0, last);
            swap(arr, max , last);
        }
    }

    static int maxIndex(int[] arr , int start , int end){
        int max = start;
        for (int i = 0;i <= end;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    //selection sort in one method (ascending order)
    static void selectionSortInOne(int[] arr){
        for(int i = 0; i< arr.length - 1; i++){
            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
