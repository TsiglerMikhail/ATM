package ru.example.atm;

public class ValidateInputException extends Exception{

    public ValidateInputException(){
        super("Ошибка валидации");
    }

    public ValidateInputException(String text){
        super(text);
    }

    public ValidateInputException(String text, Throwable cause) {
        super(text, cause);
    }

    public ValidateInputException(Throwable cause) {
        super(cause);
    }

    public ValidateInputException(String text, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(text, cause, enableSuppression, writableStackTrace);
    }
}
