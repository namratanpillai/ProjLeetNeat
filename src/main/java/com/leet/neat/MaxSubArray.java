package com.leet.neat;

//Kadanes algo-->maximum contigious subarray
/*Tipping point:
* Whether adding the new element to the existing sum
* Starting the array with the new element
*
*
* Always maintain a max sum --> and compare it to the current sum
*
* O(n-1) -->Theough we can say O(n)
* */
public class MaxSubArray {

    public int findMaxSubArray(int[] nums) {

        int maxSum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],nums[i]+currentSum);
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
