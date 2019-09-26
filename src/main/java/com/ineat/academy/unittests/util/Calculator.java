package com.ineat.academy.unittests.util;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int add(Integer x, Integer y) {
        return x + y;
    }

    public int subtract(Integer x, Integer y) {
        return x - y;
    }
}
