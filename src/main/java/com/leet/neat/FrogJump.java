package com.leet.neat;

import java.util.HashMap;
import java.util.HashSet;

public class FrogJump {
    public boolean canCross(int[] stone) {

        HashMap<Integer, HashSet<Integer>> map=new HashMap<Integer,HashSet<Integer>>();

        for(int i=0;i<stone.length;i++){
            map.put(stone[i],new HashSet<Integer>());
        }

        map.get(stone[0]).add(1);


        for(int i=0;i<stone.length;i++){
            HashSet<Integer> jumps=map.get(stone[i]);
            for(int jump:jumps){
                int position=jump+stone[i];

                if(position==stone[stone.length-1]){
                    return true;
                }
                if(map.containsKey(position)){
                    if(jump-1>0)
                        map.get(position).add(jump-1);
                    map.get(position).add(jump);
                    map.get(position).add(jump+1);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] m={0,1,3,5,6,8,12,17};
        FrogJump frogJump=new FrogJump();
        frogJump.canCross(m);
    }
}
