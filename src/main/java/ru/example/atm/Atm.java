package ru.example.atm;

import ru.example.bank.Data;

import java.math.BigDecimal;

public class Atm {
    private String atmID;
    private boolean isAlive;
    private BigDecimal cash;
    private Data bd;



    public String getBalance(User user){
        if(bd.getPin(user.getCardNumber()) == user.getPin()){
            return "На Вашем счете:\t" + bd.getBalance(user.getCardNumber());
        }
        return "Ошибка аутентификации";
    }


    public Atm(String atmID, boolean isAlive, BigDecimal cash) {
        this.atmID = atmID;
        this.isAlive = isAlive;
        this.cash = cash;
        this.bd=new Data();
    }
}
