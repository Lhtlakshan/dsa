package maths;

public class PrimeOrNot {

    public static void main(String[] args) {
        int num = 20;

        boolean [] arr = new boolean[num +1];

        allPrimes(num , arr);
    }

    static boolean[] allPrimes(int num , boolean[] primes){
        if(num < 2){
            return null;
        }

        for (int i = 2; i <= num; i++) {
            if(!primes[i]){
                for (int j = 0; j <= num;j+=i){
                    if (j % i == 0){
                        primes[j] = true;
                        System.out.println(j);
                    }
                }
            }
        }

        return primes;
    }


//    public static void primeNumbers(int num){
//        for (int i = 0; i <= num; i++) {
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }
//    }


    public static boolean isPrime(int num){

        if(num < 2){
            return false;
        }

        for (int i=2;i<= Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
