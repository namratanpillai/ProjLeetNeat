package com.leet.neat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStringWithoutRepCharTest {

    @ParameterizedTest
    @CsvSource({"abcabcbb,3", "tmmzuxt,5", "bbbbb,1"})
    void lengthOfLongestSubstring(String s,int maxSubString) {
        LongestSubStringWithoutRepChar longestSubStringWithoutRepChar=new LongestSubStringWithoutRepChar();
        Assertions.assertEquals(maxSubString,longestSubStringWithoutRepChar.lengthOfLongestSubstring(s));

    }
}