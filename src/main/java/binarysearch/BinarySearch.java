package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,9,12,34,567};
        int[] arr2 = {8,6,5,4,3,2,1};

        System.out.println(binarySearch(arr,1));
        System.out.println(binarySearch(arr2,1));
    }

    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end-start)/2; // (end - start)/2

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc == true){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
