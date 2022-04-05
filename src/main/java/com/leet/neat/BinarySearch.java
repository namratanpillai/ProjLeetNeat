package com.leet.neat;

public class BinarySearch {

    //Original solution-->Not optimal
    /*public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=(nums.length)/2;

        while(nums[mid] != target && start<=end){
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }
            mid=(end+start)/2;
        }
        if(nums[mid]!=target){
            return -1;
        }

        return mid+1;
    }*/

    public int search(int[] nums, int target) {

        int mid;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            mid = (end + start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
        }

        return -1;
    }
}
