package com.leet.neat;

public class EvunDigitSum {
    public int countEven(int num) {
        int finalCount=0;
        if(num<10){
            for(int i=1;i<=num;i++){
                if(i%2==0)
                    finalCount+=1;
            }
        }else{
            finalCount=4;
        }

        if(num>=10){
            for(int i=10;i<=num;i++){
                finalCount=finalCount+isDigitSum(i);
            }
        }
        return finalCount;
    }

    private int isDigitSum(int num){
        int sum=0;
        while(num!=0){
            int k=num%10;
            sum=sum+k;
            num=num/10;
        }


        if(sum%2==0)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        EvunDigitSum evunDigitSum=new EvunDigitSum();
//        evunDigitSum.countEven(30);

        evunDigitSum
                .isDigitSum(444);
    }
}
