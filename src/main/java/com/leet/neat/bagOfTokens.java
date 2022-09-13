package com.leet.neat;

import java.util.Arrays;

public class bagOfTokens {

    public int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);
        int score=0;

        int lp=0;
        int rp=tokens.length-1;
        while(rp>=lp){
            if(tokens[lp]<=power){
                score+=1;
                power=power-tokens[lp];
                lp+=1;
            } else if( score>=1 && rp-lp>1 ){

                power=power+tokens[rp];
                score-=1;
                rp-=1;
            }else {
                break;
            }


        }

        return score;
    }
    public static void main(String[] args) {
        int [] tokens= {90,69,47};
        bagOfTokens bagOfTokens=new bagOfTokens();
        bagOfTokens.bagOfTokensScore(tokens,10);
    }
}
