package com.calc.calculator.service;

import com.calc.calculator.dto.CalculateServiceRequest;
import com.calc.calculator.dto.CalculateServiceResponse;
import com.calc.calculator.operation.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CalculateServiceImpl implements CalculatorService{

    private final List<Operation> operationList;

    @Override
    public CalculateServiceResponse calculate(CalculateServiceRequest calculateServiceRequest) {
        return operationList.stream()
                .filter(operation -> operation.isApplicable(calculateServiceRequest))
                .findFirst()
                .orElseThrow()
                .calculate(calculateServiceRequest);

    }
}
