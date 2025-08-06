package sorting;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        int[] arr = {2,23,44,59,1,2,5,30};

        System.out.println(secondLarge(arr)); // second large number
//        for (int a:arr){
//            System.out.println(a);
//        }
        bubbleSort(arr); //sort
        System.out.println(Arrays.toString(arr));

 
    }

    public static void bubbleSort(int [] arr){

        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i-1; j++) {
                if(arr[j] > arr[j+1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if (!swapped){
                break;
            }
        }
    }

    public static int secondLarge(int[] arr){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[arr.length-2];
    }


}
