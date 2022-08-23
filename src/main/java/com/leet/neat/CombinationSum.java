package com.leet.neat;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findComb(0, candidates,target ,ans,  new ArrayList<>() );
        return ans;
    }

    public static void main(String[] args) {
        CombinationSum c=new CombinationSum();
        c.combinationSum(new int[] {2,3,6,7},7);
    }


   private void findComb(int index, int arr[],int target,List<List<Integer>> ans, List<Integer> ds ){

        if(index== arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[index]<=target){
            ds.add(arr[index]);
            findComb(index, arr,target-arr[index], ans,  ds );
            ds.remove(ds.size() -1);
        }
        findComb(index+1,arr, target, ans,  ds );
    }


}
