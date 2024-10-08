package DYNAMIC_PROGRAMMING;
import java.util.HashMap;
public class Fibonacci_sequence {

    static HashMap<Long, Long> memo = new HashMap<>();

    public static long fib(long n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        long n = 6L;
        System.out.println(fib(n));
    }
}
