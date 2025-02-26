package maths;

public class ReverceNum {
    public static void main(String[] args) {
        System.out.println(reverseNum(123456789));
        System.out.println(reverseNum(8));

    }

    static int reverseNum(int num){
        if(num < 10){
            return num;
        }

        return Integer.parseInt(num%10 + "" + reverseNum(num/10));
    }
}
