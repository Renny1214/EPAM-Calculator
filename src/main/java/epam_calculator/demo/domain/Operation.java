package epam_calculator.demo.domain;

import org.springframework.stereotype.Component;

@Component
public class Operation {

    private float digit1;

    private float digit2;

    private String operand;

    public float getDigit1() {
        return digit1;
    }

    public float getDigit2() {
        return digit2;
    }

    public String getOperand() {
        return operand;
    }
}
