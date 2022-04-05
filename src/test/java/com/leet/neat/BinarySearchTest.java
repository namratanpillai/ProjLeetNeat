package com.leet.neat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BinarySearchTest {

    @ParameterizedTest
    @MethodSource("integerArrayToTest")
    @DisplayName("Maximum contiguous subArray")
    void search(int[] nums, int target, int position) {
        BinarySearch binarySearch=new BinarySearch();

        Assertions.assertEquals(binarySearch.search(nums,target),position);
    }

    private static Stream<Arguments> integerArrayToTest() {
        return Stream.of(
                Arguments.of(new int[]{-1,0,3,5,9,12},9,4),
                Arguments.of(new int[]{-1,0,3,5,9,12},2,-1)
        );
    }
}