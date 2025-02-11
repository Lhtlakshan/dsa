package linearsearch;

public class LinearSearch {
    public static void main(String[] args) {

//        System.out.println(searchChar("Thilina" , 'a'));

        System.out.println(maxValue(new int[]{1,2,90,4,5}));

    }

    static boolean searchChar(String str , char ch){

        if(str.length() == 0){
            return false;
        }

        for(char c : str.toCharArray()){
            if (ch == c){
                return true;
            }
        }

        return false;
    }

    static int maxValue(int[] arr){

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }
}
