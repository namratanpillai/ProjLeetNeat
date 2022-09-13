package com.leet.neat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumbersWithSameConsecutiveDifference {
    public int[] numsSameConsecDiff(int n, int k) {
        Set<Integer> distinctNumber= new HashSet <>();

        for(int i=0;i<=9;i++){
            for(int j=1;j<=i;i++){
                if(Math.abs(i-j)==k){
                    int number=createNumber(n,i,j);
                    if(number>=Math.pow(10,(n-1)) && number<=Math.pow(10,(n))){
                        distinctNumber.add(number);
                    }
                }
            }
        }
        return distinctNumber.stream().mapToInt(Integer::intValue).toArray();
    }

    private int createNumber(int n, int fd, int sd){
        int number=0;
        while(n>=0){
            if(n%2==1){
                number+=10^n*fd;
            }else{
                number+=10^n*sd;
            }
            n--;
        }
        return number;
    }
}
