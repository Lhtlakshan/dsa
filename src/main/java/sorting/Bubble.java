package sorting;

public class Bubble {

    public static void main(String[] args) {

        int[] arr = {2,7,1,2,5,30};

        bubbleSort(arr);

        for (int a:arr){
            System.out.println(a);
        }

    }

    public static void bubbleSort(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
