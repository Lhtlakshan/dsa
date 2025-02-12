package binarysearch;

import java.util.Arrays;

public class PracticalUsage {

    public static void main(String[] args) {
        int[] arr = findStartAndLastIndex(new int[]{1,4,5,5,5,5,5,5,6,2,1,3,2},5);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] findStartAndLastIndex(int[] nums , int target){

        int[] ans = {-1,-1};
         ans[0] = searchIndexOfArray(nums , target , true);
        ans[1] = searchIndexOfArray(nums , target , false);

        return ans;

    }

    private static int searchIndexOfArray(int[] nums, int target, boolean findStartElement) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else{
                ans = mid;
                if(findStartElement){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }

        }

        return ans;
    }
}
