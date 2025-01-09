package com.calc.calculator.service;

import com.calc.calculator.dto.CalculateServiceRequest;
import com.calc.calculator.dto.CalculateServiceResponse;

public interface CalculatorService {
    CalculateServiceResponse calculate(CalculateServiceRequest calculateServiceRequest);
}
