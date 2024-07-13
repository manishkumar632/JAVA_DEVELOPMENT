package DYNAMIC_PROGRAMMING;
import java.util.HashMap;
public class Tribonacci_number {
    static HashMap<Long, Long> memo = new HashMap<>();

    public static long tribonacci(long n) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long result = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        memo.put(n, result);
        return result;
    }
    public static void main(String[] args) {
        long n = 8l;
        System.out.println(tribonacci(n));
    }
}
