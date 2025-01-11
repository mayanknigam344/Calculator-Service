package com.calc.calculator.service;

import com.calc.calculator.dto.CalculateServiceRequest;
import com.calc.calculator.dto.CalculateServiceResponse;
import com.calc.calculator.service.operation.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculateServiceImpl implements CalculatorService{

     @Autowired private List<Operation> operationList;

    @Override
    public CalculateServiceResponse calculate(CalculateServiceRequest calculateServiceRequest) {
        return operationList.stream()
                .filter(operation -> operation.isApplicable(calculateServiceRequest))
                .findFirst()
                .orElseThrow()
                .calculate(calculateServiceRequest);

    }
}
