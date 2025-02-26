package maths;

import java.util.HashSet;
import java.util.Set;

public class Maths {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }

    static boolean isPrime(int num){
        if(num < 2){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //happy number
    public static boolean isHappy(int n) {

        Set<Integer> visit = new HashSet<>();

        while(!visit.contains(n)){
            if(n == 1){
                return true;
            }
            visit.add(n);
            n = getNext(n);
        }
        return false;
    }

    static int getNext(int n){
        int output = 0;

        while(n > 0){
            int digit = n % 10;
            output += digit * digit;
            n /= 10;
        }

        return output;
    }

}
