package com.calc.calculator.operation;

import com.calc.calculator.dto.CalculateServiceRequest;
import com.calc.calculator.dto.CalculateServiceResponse;
import org.springframework.stereotype.Component;

@Component
public class SubtractOperation implements Operation {

    @Override
    public CalculateServiceResponse calculate(CalculateServiceRequest request) {
        CalculateServiceResponse response = new CalculateServiceResponse();
        var add = request.getNum1() - request.getNum2();
        response.setResult(add);
        return response;
    }

    @Override
    public boolean isApplicable(CalculateServiceRequest request) {
       return request.getOperation().equals("sub");
    }
}
