package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] arr = {6,4,2,1,8};
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));

        String name = "Java";
        name.toUpperCase(); // returns "JAVA" but doesn't change name
        System.out.println(name);

        int c = 65;
        char a = (char)c;
        System.out.println(a);




    }

    public static void insertionSort(int[] arr){
        for (int i=1; i< arr.length; i++){
            int key = arr[i];

            int j = i-1;

            while(j >= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
