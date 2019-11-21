package com.ineat.academy.unittests.controller;

import com.ineat.academy.unittests.util.Fibonacci;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {
    private final Fibonacci fibonacci;

    public FibonacciController(Fibonacci fibonacci) {
        this.fibonacci = fibonacci;
    }

    @GetMapping("/fib/to/{x}")
    public int fibTo(@PathVariable("x") final int x) {
        return fibonacci.fibTo(x);
    }
}
