package recurrence.arrays;

import java.util.ArrayList;

public class sorted {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,3,1,2,4,5,2,2};

        System.out.println(sorted(arr, 0));
        System.out.println(allIndices(arr,2,0,new ArrayList<>()));
    }

    public static boolean sorted(int[] arr, int i){
        if(i == arr.length-1 ){
            return true;
        }

        return (arr[i] < arr[i+1]) && sorted(arr, i+1);
    }

    static public ArrayList<Integer> allIndices(int[] arr,int target, int index, ArrayList<Integer> arrayList){
        if(index == arr.length){
            return arrayList;
        }

        if(arr[index] == target){
            arrayList.add(index);
        }

        return allIndices(arr,target,index+1,arrayList);
    }
}
