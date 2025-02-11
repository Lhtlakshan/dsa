package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class array1 {

    public static void main(String [] args){
//        System.out.println(noOfCharacter("Thilina Lakshan"));;

//
//        int [] arr= {1, 2, 4, 3, 5};
//
//        for (int i:arr){
//            System.out.println(i);
//        }
//
//        System.out.println(maxValue(new int[]{1,2,3,20}));

        int[] array = {1,2,3,4,5,6};

        reverse(array);
        System.out.println(Arrays.toString(array));
    }

//    public static int noOfCharacter(String str){
//        char[] arr = str.toCharArray();
//        HashSet<Character> hashSet = new HashSet();
//
//        for (int i = 0 ;i<str.length();i++){
//            hashSet.add(arr[i]);
//        }
//        return hashSet.size();
//    }


    public static int maxValue(int []arr){
        int max = arr[1];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }


    public static void swap(int[] arr , int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr , start , end);
            start++;
            end--;
        }
    }



}
