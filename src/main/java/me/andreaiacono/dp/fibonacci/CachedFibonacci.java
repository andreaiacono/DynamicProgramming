package me.andreaiacono.dp.fibonacci;

import java.time.Instant;

public class CachedFibonacci {

    public static void main(String[] args) {
        int n = 50;
        System.out.println("Started cached computing the " + n + "th Fibonacci number at " + Instant.now());
        System.out.println("The " + n + "th Fibonacci number is " + fib(n, new long[n+1]));
        System.out.println("Finished cached computing the " + n + "th Fibonacci number at " + Instant.now());
    }

    static long fib(int n, long[] results) {
        if (n == 0) {
            return 0L;
        }
        else if (n == 1) {
            return 1L;
        }
        if (results[n] != 0L) {
            return results[n];
        }
        long result = fib(n-1, results) + fib(n-2, results);
        results[n] = result;

        return result;
    }
}

