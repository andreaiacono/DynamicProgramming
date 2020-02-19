package me.andreaiacono.dp.fibonacci;

import java.time.Instant;

public class EfficientFibonacci {

    public static void main(String[] args) {
        int n = 50;
        System.out.println("Started efficient computing the " + n + "th Fibonacci number at " + Instant.now());
        System.out.println("The " + n + "th Fibonacci number is " + fib(n));
        System.out.println("Finished efficient computing the " + n + "th Fibonacci number at " + Instant.now());
    }

    static long fib(int n) {
        int counter = 0;
        long first = 0;
        long second = 1;
        while (counter++ < n) {
            long tmp = first + second;
            first = second;
            second = tmp;
        }
        return first;
    }
}

