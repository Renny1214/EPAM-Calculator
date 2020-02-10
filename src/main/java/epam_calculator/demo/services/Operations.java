package epam_calculator.demo.services;

import org.springframework.stereotype.Service;

@Service
public class Operations {

    public float operationDone(float digit1,float digit2,String operand) throws ExceptionHandling {
        if(operand.toLowerCase().equals("add"))
            return addition(digit1,digit2);
        else if(operand.toLowerCase().equals("subtract"))
            return subtraction(digit1,digit2);
        else if(operand.toLowerCase().equals("multiply"))
            return multiply(digit1,digit2);
        else if(operand.toLowerCase().equals("divide"))
            return divide(digit1,digit2);
        else
            throw new ExceptionHandling();
    }

    private float addition(float digit1,float digit2){
        return digit1+digit2;
    }
    private float subtraction(float digit1,float digit2){
        return digit1-digit2;
    }
    private float multiply(float digit1,float digit2){
        return digit1*digit2;
    }
    private float divide(float digit1,float digit2){
        return digit1/digit2;
    }

}
