package ru.example.atm;

import ru.example.bank.Cash;
import ru.example.bank.Data;
import ru.example.bank.DuplicateTransactionException;

import java.math.BigDecimal;

public class Atm {
    private String atmID;
    private boolean isAlive;
    private Cash cash;
    private Data bd;

    public Atm(String atmID, boolean isAlive) {
        this.atmID = atmID;
        this.isAlive = isAlive;
        this.cash = new Cash(0);
        this.bd=new Data();
    }

    public Atm(String atmID, boolean isAlive, int cash) {
        this.atmID = atmID;
        this.isAlive = isAlive;
        this.cash = new Cash(cash);
        this.bd=new Data();
    }

    public String showBalance(Card card) throws DuplicateTransactionException {
        if (bd.authentication(card)) {
            return "На счете:\t" + bd.getBalance(card.getCardNumber());
        }
        return "Ошибка аутентификации";
    }

    public String giveOutCash(Card card, int sum) throws DuplicateTransactionException {
        if (bd.authentication(card)) {
            Cash tmp = bd.getBalance(card.getCardNumber());
            if(tmp.getCurrency() == this.cash.getCurrency()) {
                if (tmp.getBalance().compareTo(BigDecimal.valueOf(sum)) >= 0) {
                    if(bd.minusBalance(card.getCardNumber(), BigDecimal.valueOf(sum))){
                        this.cash = this.cash.subtract(BigDecimal.valueOf(sum));
                        return "Заберите деньги";
                    }
                    return "Не смог списать деньги со счёта";
                }
                return "Недостаточно средств на счёте";
            }
            return "Конвертер валют не работает";
        }
        return "Ошибка аутентификации";
    }


}
