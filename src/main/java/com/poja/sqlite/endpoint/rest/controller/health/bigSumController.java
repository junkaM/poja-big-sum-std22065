package com.poja.sqlite.endpoint.rest.controller.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BigIntegerController {

    @Autowired
    private BigIntegerService bigIntegerService;

    @GetMapping("/addBigIntegers")
    public String addBigIntegers(@RequestParam String num1, @RequestParam String num2) {

        BigInteger result = bigIntegerService.addBigIntegers(num1, num2);
        return "Result: " + result.toString();
    }
}
