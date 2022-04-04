package com.leet.neat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MaxSubArrayTest {


    @ParameterizedTest
    @MethodSource("integerArrayToTest")
    @DisplayName("Maximum contiguous subArray")
    void findMaxSubArray(int[] nums, int maxSum) {
        MaxSubArray maxSubArray=new MaxSubArray();

        Assertions.assertEquals(maxSubArray.findMaxSubArray(nums),maxSum);
    }

    private static Stream<Arguments> integerArrayToTest() {
        return Stream.of(
                Arguments.of(new int[]{-2,2,5,-11,6},7)
        );
    }
}