package binarysearch.q;

public class Ceiling {

    public static void main(String[] args) {

        int[] arr = {2,4,6,8};
        System.out.println(ceiling(arr,9));;

    }
    public static int ceiling(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start < end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[end] < target){
                    return -1;
                }
                if (arr[mid] > target)
                    end = mid -1;
                else
                    start = mid +1;
            }else{
                if(arr[start] < target){
                    return -1;
                }
                if (arr[mid] > target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return arr[start];
    }
}
