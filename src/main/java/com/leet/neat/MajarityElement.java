package com.leet.neat;


public class MajarityElement {

    public int majorityElement(int[] nums) {


        int ansIndex=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[ansIndex]==nums[i]){
                count++;
            }else{
                count--;
            }

            if(count==0){
                ansIndex=i;
                count=1;
            }
        }

        return nums[ansIndex];
    }

    public static void main(String[] args) {
        MajarityElement majarityElement=new MajarityElement();
        majarityElement.majorityElement(new int[]{1,3,1,1,4,1,1,5,1,1,6,2,2});
    }
}
