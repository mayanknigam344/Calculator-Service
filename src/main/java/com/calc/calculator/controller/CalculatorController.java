package com.calc.calculator.controller;

import com.calc.calculator.dto.CalculateServiceRequest;
import com.calc.calculator.dto.CalculateServiceResponse;
import com.calc.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired CalculatorService calculatorService;

    @PostMapping(value = "/calculate",  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CalculateServiceResponse> calculate(@RequestBody CalculateServiceRequest calculateServiceRequest) {
        return ResponseEntity.ok(calculatorService.calculate(calculateServiceRequest));
    }
}
