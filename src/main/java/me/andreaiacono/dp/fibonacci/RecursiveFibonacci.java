package me.andreaiacono.dp.fibonacci;

import java.time.Instant;

public class RecursiveFibonacci {

    public static void main(String[] args) {
        int n = 50;
        System.out.println("Started recursive computing the " + n + "th Fibonacci number at " + Instant.now());
        System.out.println("The " + n + "th Fibonacci number is " + fib(n));
        System.out.println("Finished recursive computing the " + n + "th Fibonacci number at " + Instant.now());
    }

    static long fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }
}

