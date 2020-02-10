package epam_calculator.demo.controller;


import epam_calculator.demo.domain.Operation;
import epam_calculator.demo.services.Operations;
import epam_calculator.demo.services.ExceptionHandling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/operate")
public class MathsOperations {

    @Autowired
    Operations doOperation;

    @PostMapping(path = "/Operation",consumes = "application/json")
    public float operation(@RequestBody Operation operation) throws ExceptionHandling {
        System.out.println("Request : "+operation.toString());
        return doOperation.operationDone(operation.getDigit1(), operation.getDigit2(), operation.getOperand());
    }
}
