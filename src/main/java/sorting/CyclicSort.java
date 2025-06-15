package sorting;

import java.util.ArrayList;
import java.util.Arrays;

import static sorting.CyclicSort.swap;

//When no.s from 1-n use this
public class CyclicSort {
    public static void main(String[] args) {

        int[] arr = {1,2,4};

        //cyclicSort(arr);
        System.out.println(missingNos(arr));
    }

    public static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i , correct);
            }
            i++;
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static int missingNo(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr , i, correct);
            }
            i++;

        }

        //search for missing number
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }

        return arr.length;
    }

    public static ArrayList<Integer> missingNos(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr , i, correct);
            }
            i++;
        }

        //search for missing number
        ArrayList<Integer> arrMissing = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                arrMissing.add(j);
            }
        }
        // If no missing numbers in between, missing might be the last one
        if (arrMissing.isEmpty()) {
            arrMissing.add(arr.length);
        }

        return arrMissing;
    }

}

