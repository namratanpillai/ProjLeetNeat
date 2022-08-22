package com.leet.neat.recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        SumOfDigits sumOfDigits=new SumOfDigits();
        System.out.println(sumOfDigits.dig(151));
    }

    private int dig(int n){
         if(n<=0)
            return 0;
        else{
            return n%10+dig(n-1);
        }
    }
}
