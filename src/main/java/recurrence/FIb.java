package recurrence;

public class FIb {
    public static void main(String[] args) {

    }

    public static int fib(int num){
        if(num < 2){
            return num;
        }
        return fib(num-1) + fib(num-2);
    }
}
