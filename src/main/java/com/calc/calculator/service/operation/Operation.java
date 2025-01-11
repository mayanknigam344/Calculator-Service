package com.calc.calculator.service.operation;

import com.calc.calculator.dto.CalculateServiceRequest;
import com.calc.calculator.dto.CalculateServiceResponse;

public interface Operation {

    CalculateServiceResponse calculate(CalculateServiceRequest request);

    boolean isApplicable(CalculateServiceRequest request);
}
