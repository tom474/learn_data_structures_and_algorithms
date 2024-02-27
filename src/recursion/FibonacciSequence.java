package recursion;

public class FibonacciSequence {
    static Integer[] memo = new Integer[100];

    public static int fib(int n) {
        if (memo[n] != null) {
            return memo[n];
        }
        if (n == 0 || n == 1) {
            return n;
        }
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println("\nFib of " + n + " = " + fib(n));
    }
}
