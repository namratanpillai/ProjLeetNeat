package com.leet.neat.recursion;

public class Fibonacci {

    public static void main(String[] args) {

        Fibonacci fibonacci=new Fibonacci();
        System.out.println(fibonacci.fib(3));
    }

    private int fib(int n){

        if(n<1)
            return -1;
        else if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
}
