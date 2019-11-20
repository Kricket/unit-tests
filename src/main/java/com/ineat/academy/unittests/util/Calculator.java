package com.ineat.academy.unittests.util;

import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class Calculator {
    public int add(Integer x, Integer y) {
        BigInteger bx = BigInteger.valueOf(x);
        BigInteger by = BigInteger.valueOf(y);
        BigInteger result = BigInteger.ZERO;

        for(int i=0; i<=Math.max(bx.bitCount(), by.bitCount()); i++) {
            if(bx.testBit(i) ^ by.testBit(i)) {
                result = result.setBit(i);
            } else {
                result = result.clearBit(i);
            }
        }

        return result.intValue();
    }

    public int subtract(Integer x, Integer y) {
        return x - y;
    }
}
