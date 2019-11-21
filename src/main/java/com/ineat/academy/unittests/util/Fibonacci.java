package com.ineat.academy.unittests.util;

import org.springframework.stereotype.Component;

@Component
public class Fibonacci {
    /**
     * The Fibonacci Sequence is defined, for n>=0, by:
     * f(0) = 0
     * f(1) = 1
     * f(n) = f(n-2) + f(n-1)
     * The first few values are thus 0, 1, 1, 2, 3, 5, 8, 13, 21...
     *
     * This function calculates f(n) for a given value of n.
     */
    public int fibTo(int n) {
        int fm1 = 1;
        int f = 1;

        for(int i = 3; i <= n; i++) {
            int fi = fm1 + f;
            fm1 = f;
            f = fi;
        }

        return f;
    }
}
