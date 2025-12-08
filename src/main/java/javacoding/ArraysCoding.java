package javacoding;

public class ArraysCoding {
    public static void main(String[] args) {

        System.out.println(getMissingNum(new int[]{1,3,4,5,6,7}));

    }


    //find the missing number in an array
    public static int getMissingNum(int[] num){
        int arrLength = num.length + 1;
        int totalSum = arrLength * (arrLength + 1)/2;
        int arrSum = 0;

        for(int i: num){
            arrSum += i;
        }

        return totalSum - arrSum;

    }

}
