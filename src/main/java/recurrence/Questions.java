package recurrence;

import java.util.ArrayList;

public class Questions {

    public static void main(String[] args) {
        Integer[] arr = {1,3,6,12,3,7};

//        System.out.println(findAllIndexLinearSearch(arr , 3,0,new ArrayList<>()));
//        System.out.println(noOfZeros(20001011));

        Integer t = 536870912;
        Double x = Math.log(t)/Math.log(2);

        System.out.println(Math.floor(x));
        System.out.println(Math.ceil(x));
    }

    public static boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }

        Double x = Math.log(n)/Math.log(2);
        return x == Math.floor(x);
    }

    static ArrayList<Integer> findAllIndexLinearSearch(Integer[] arr , Integer target, int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndexLinearSearch(arr , target , index+1, list);
    }

    static int sum = 0;
    public static void revDigits(int num){
        if(num == 0){
            return;
        }

        sum = sum*10 + num%10;
        revDigits(num/10);
    }

    //number of zeros
    public static int noOfZeros(int num){
        return helper(num , 0);
    }

    private static int helper(int num, int i) {
        if(num == 0){
            return i;
        }
        if(num%10 == 0){
            return helper(num/10 , i+1);
        }
        return helper(num/10 , i);
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    
}
