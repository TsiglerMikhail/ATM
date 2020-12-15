package ru.example.atm;

public class ValidateInputException extends Exception{
    public ValidateInputException(String text){
        super(text);
    }
}
