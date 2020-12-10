package ru.example.bank;

public class DuplicateTransactionException extends Exception{
    public DuplicateTransactionException(String text){
        super(text);
    }
}
