package me.andreaiacono.recursion.math;

public class FactorialComputer {

    public long factorial(long n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

}
