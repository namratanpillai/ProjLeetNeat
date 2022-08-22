package com.leet.neat.recursion;

public class Power {

    public static void main(String[] args) {
        Power power=new Power();
        System.out.println(power.power(2,2));
    }

    private int power(int number, int power){
         if(power==0)
            return 1;
        else{
            return number*power(number,power-1);
        }
    }
}
