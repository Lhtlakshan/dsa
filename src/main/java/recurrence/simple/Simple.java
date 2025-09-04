package recurrence.simple;

public class Simple {

    public static void main(String[] args) {
        System.out.println(fact(-1));
        System.out.println(sumOfDigits(123));
        System.out.println(reverseNumber(111222333));
    }

    public static int fact(int num){
        if(num <=1){
            return 1;
        }

        return num*fact(num-1);
    }

    public static int sumOfDigits(int num){

        if(num == 0){
            return 0;
        }
        return num%10 + sumOfDigits(num/10);
    }

    public static int reverseNumber(int num){
        int num2 = 0;

        while(num > 0){
            num2 = num2*10 + num%10;
            num = num/10;
        }

        return num2;
    }
}
