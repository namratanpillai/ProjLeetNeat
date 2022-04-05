package com.leet.neat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {


    @ParameterizedTest
    @MethodSource("integerArrayToTest")
    @DisplayName("Two Sum")
    void twoSum(int[] nums, int target, int[] sum) {
        TwoSum twoSum=new TwoSum();

        Assertions.assertArrayEquals(twoSum.twoSum(nums,target),sum);
    }

    private static Stream<Arguments> integerArrayToTest() {
        return Stream.of(
               Arguments.of(new int[]{3,2,4},6,new int[]{1,2},
                        Arguments.of(new int[]{2,7,11,15},9,new int[]{0,1})
        ));}
}