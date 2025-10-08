package recurrence;

import java.util.HashMap;

public class FIb {
    static HashMap<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fib(50));
    }

    public static long fib(int num) {
        if (num < 2) return num;

        if (memo.containsKey(num)) {
            return memo.get(num);
        }

        long result = fib(num - 1) + fib(num - 2);
        memo.put(num, result);
        return result;
    }
}
