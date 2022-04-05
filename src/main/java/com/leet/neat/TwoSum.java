package com.leet.neat;

import java.util.HashMap;

public class TwoSum {

    //Brute force Attempt
    /*public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }*/

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int remaining=target-nums[i];
            if(map.containsKey(remaining)){
                return new int[]{map.get(remaining),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
