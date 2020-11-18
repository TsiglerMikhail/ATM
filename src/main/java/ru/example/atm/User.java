package ru.example.atm;

import java.math.BigDecimal;

public class User {
    private String cardNumber;
    private String pin;
    private BigDecimal cash;

    public User(String cardNumber, String pin){
        this.cardNumber=cardNumber;
        this.pin=pin;
    }

    public User(String cardNumber, String pin, BigDecimal cash){
        this.cardNumber=cardNumber;
        this.pin=pin;
        this.cash=cash;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }
}
