package com.leet.neat.recursion;

public class Factorial {

    public static void main(String[] args) {

        Factorial fact=new Factorial();
        System.out.println(fact.factorial(3));
    }

    private int factorial(int n){

        if(n<=1)
            return -1;
        else if(n==0|| n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
