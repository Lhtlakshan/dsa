package javacoding;



public class JavaCoding1 {

    public static void main(String[] args) {
//        System.out.println(isPrime(11));
//
//        int a = 10;
//        int b = 20;
//
//        System.out.println(factorial(5));
//        System.out.println(reverseNumber(234));
//        System.out.println(isArmstrongNo(153));

//        System.out.println(reverseStringAll("My name is thilina hewage"));

//        System.out.println(noOfWordsInAString("Hi , bro my name is thilina hewage.   I am 23 years old"));

//        System.out.println(isAnagram("aeff","faef"));
//        countVowelsAndConstant("samankamal");


        int a = 23;
        Integer b= a;

        Integer c = 12;
        int d = c;

    }

    // 1) prime
    public static Boolean isPrime(int val){
        if(val <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(val) ; i++) {
            if(val%i == 0){
                return false;
            }
        }

        return true;
    }

    public static void fibonacciSeries(int num){
        if(num <= 0){
            return;
        }

        int first = 0,second = 1,next;

        for(int i=1; i<=num; i++){
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }

    // 2) factorial of given number
    public static int factorial(int num){
        if(num == 0) return 1;

        int fact = 1;
        for (int i = 2; i <= num ; i++) {
            fact *= i;
        }

        return fact;
    }

    // 3) reverse a number
    public static int reverseNumber(int num){

        int rev = 0,r;
        while(0 < num){
            r = num%10;
            rev = rev*10 + r;
            num /= 10;
        }

        return rev;
    }

    // 4) no of digits
    public static int noOfDigits(int num){

        int count = 0;

        if(num<0){
            num *= -1;
        }else if(num == 0){
            num = 1;
        }

        while(0 < num){
            num = num/10;
            count++;
        }

        return count;
    }


    // 5) check the number value == sum of each digits power of digit count
    public static Boolean isArmstrongNo(Integer num){
        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while(num > 0){
            int r = num%10;
            sum += Math.pow(r,digits);
            num /= 10;
        }

        return sum == original;
    }

    // 6) check the number if palindrome
    public static Boolean isPalindromeNum(int num){

        int originalNum = num;
        int reversedNum = 0;

        while(num > 0){
            int digit = num % 10;
            reversedNum = digit + reversedNum*10;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    // 7) sum of digits of a number
    public static int sumDigits(int num){
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }

    // 8) reverse a string
    public static String reverseString(String str){

        StringBuilder strRev = new StringBuilder();

        int length = str.length();
        for (int i = 0; i < length; i++) {
            strRev.append(str.charAt(length - 1 - i));
        }

        return strRev.toString();
    }

    // 9) reverse each words in given string
    public static String reverseStringAll(String str){

        StringBuilder strAll = new StringBuilder();
        String[] strArr = str.split(" ");

        for (String string:strArr) {
            StringBuilder strRev = new StringBuilder();
            String wordStr = string;

            int length = wordStr.length();
            for (int j = 0; j < length; j++) {
                strRev.append(wordStr.charAt(length - 1 - j));
            }

            strAll.append(strRev + " ");
        }

        return strAll.toString();
    }


    // 10) count the no of words in a string
    public static int noOfWordsInAString(String str){

        str = str.trim();

        int count = 0;

        if(str.length() == 0){
            return 0;
        }else{
            count = 1;
            for (int i = 0; i < str.length() - 1; i++) {
                if(str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                    count++;
                }
            }
        }

        return count;
    }


}
