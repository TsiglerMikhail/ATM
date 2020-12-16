package ru.example.bank;

public class DuplicateTransactionException extends Exception{

    public DuplicateTransactionException(){
        super("Дублирование транзакции");
    }

    public DuplicateTransactionException(String text){
        super(text);
    }

    public DuplicateTransactionException(String text, Throwable cause) {
        super(text, cause);
    }

    public DuplicateTransactionException(Throwable cause) {
        super(cause);
    }

    public DuplicateTransactionException(String text, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(text, cause, enableSuppression, writableStackTrace);
    }
}
