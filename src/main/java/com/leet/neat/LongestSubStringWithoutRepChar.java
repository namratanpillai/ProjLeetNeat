package com.leet.neat;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepChar {

    public int lengthOfLongestSubstring(String s) {

        int maximumSubstring = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        int lengthOfString = s.length();
        Map<Character, Integer> map = new HashMap<>();
        while (rightPointer <= lengthOfString - 1) {
            if (map.containsKey(s.charAt(rightPointer))) {
                if(map.get(s.charAt(rightPointer))>=leftPointer && map.get(s.charAt(rightPointer))<=rightPointer){
                    leftPointer = map.get(s.charAt(rightPointer)) +1;
                }

            }
            map.put(s.charAt(rightPointer), rightPointer);
            maximumSubstring = Math.max(maximumSubstring, rightPointer - leftPointer + 1);
            rightPointer++;

        }
        return maximumSubstring;

    }
}
