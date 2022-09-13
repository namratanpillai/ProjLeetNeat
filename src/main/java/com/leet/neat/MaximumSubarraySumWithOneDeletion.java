package com.leet.neat;

public class MaximumSubarraySumWithOneDeletion {

    public int maximumSum(int[] arr) {
        boolean onePositive=false;
        int allNegativeMax=Integer.MIN_VALUE;
        int max=0;
        int bestMax=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<0){
                allNegativeMax=Math.max(allNegativeMax,arr[i]);
                continue;
            }
            onePositive=true;
        }

        if(!onePositive){
            return allNegativeMax;
        }

        int[] forwardMax=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            max=Math.max(max+arr[i],arr[i]);
            forwardMax[i]=max;
        }

        int[] backwardMax=new int[arr.length];
        max=0;
        for(int i=arr.length-1;i>=0;i--){
            max=Math.max(max+arr[i],arr[i]);
            bestMax=Math.max(bestMax,max);
            backwardMax[i]=max;
        }

        int o=bestMax;

        for(int i=1;i<arr.length-1;i++){
            o=Math.max(o,forwardMax[i-1]+backwardMax[i+1]);
        }

        return o;
    }

    public static void main(String[] args) {
        //int [] arr= {-7,6,1,2,1,4,-1};
//        int [] arr= {1,-2,0,3};
        int [] arr= {-50};
        MaximumSubarraySumWithOneDeletion m=new MaximumSubarraySumWithOneDeletion();
        m.maximumSum(arr);
    }

}
