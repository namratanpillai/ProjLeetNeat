package com.leet.neat;

public class MaximumSubarraySumWithOneDeletion {

    public int maximumSum(int[] arr) {
        boolean onePositive=false;
        int allNegativeMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<0){
                allNegativeMax=Math.max(allNegativeMax,arr[i]);
                continue;
            }
            onePositive=true;
        }

        if(!onePositive){
            return allNegativeMax;
        }
        int localSum=0;
        int maxSum=0;
        int i=0;
        boolean continuation=false;
        while(i<arr.length-2){
            if(arr[i]<0 && localSum<0){
                localSum=localSum+arr[i];
                i=i+1;
            }
            else if(arr[i]<0 && localSum>0){
                if(arr[i+1]<0){
                    i=i+2;
                    continue;
                }else{
                    localSum=localSum+arr[i+1];
                    continuation=true;
                    i=i+2;
                }
            }else if(arr[i]>=0){
                localSum=localSum+arr[i];
                i=i+1;
            }
            maxSum=Math.max(maxSum,localSum);
        }



        if(i==arr.length-1 && !continuation){
            return Math.max(maxSum,arr[arr.length-1]);
        }else if(i==arr.length-1 && continuation){
            maxSum=Math.max(maxSum,maxSum+arr[arr.length-1]);
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int [] arr= {0,-5,-6,5,0,-5};
        MaximumSubarraySumWithOneDeletion m=new MaximumSubarraySumWithOneDeletion();
        m.maximumSum(arr);
    }

}
