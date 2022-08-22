package com.leet.neat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void reverse( ) {
        ReverseInteger reverseInteger=new ReverseInteger();
        Assertions.assertEquals(321,reverseInteger.reverse(123));
    }
}