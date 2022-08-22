package com.leet.neat;


public class ReverseInteger {

    public int reverse(int x) {

        /*int number=0;
        boolean isNumberNegative=false;

        if(x<1){
            isNumberNegative=true;
            x=x*-1;
        }*/
        int pop=0;
        int revered=0;
        while(x != 0){
            pop=x%10;

            x=x/10;

            if(revered > Integer.MAX_VALUE/10 || revered == Integer.MAX_VALUE/10){
                return 0;
            }

            if(revered < Integer.MIN_VALUE/10 || revered == Integer.MIN_VALUE/10){
                return 0;
            }

            revered=revered*10 + pop;
        }

        return revered;
    }
}
