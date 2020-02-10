package epam_calculator.demo.services;

public class ExceptionHandling extends Exception{

    public ExceptionHandling(){
        super("Invalid Operation asked to perform");
    }

}
