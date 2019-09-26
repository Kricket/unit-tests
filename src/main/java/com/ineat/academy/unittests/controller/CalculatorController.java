package com.ineat.academy.unittests.controller;

import com.ineat.academy.unittests.util.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/calc/add/{x}/{y}")
    public int add(
            @PathVariable("x") final int x,
            @PathVariable("y") final int y
            ) {
        return calculator.add(x, y);
    }

    @GetMapping("/calc/subtract/{x}/{y}")
    public int subtract(
            @PathVariable("x") final int x,
            @PathVariable("y") final int y
            ) {
        return calculator.subtract(x, y);
    }
}
