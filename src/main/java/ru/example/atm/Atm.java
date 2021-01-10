package ru.example.atm;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.example.common.Card;
import ru.example.common.Cash;
import ru.example.bank.Bank;
import ru.example.bank.DuplicateTransactionException;

import java.math.BigDecimal;
@Component
@NoArgsConstructor
public class Atm {
    private String atmID;
    private boolean isAlive = true;
    private Cash cash = new Cash(0);
    @Autowired
    private Bank bd;


    public Atm(String atmID, boolean isAlive) {
        this.atmID = atmID;
        this.isAlive = isAlive;
        this.cash = new Cash(0);
        this.bd=new Bank();
    }

    public Atm(String atmID, boolean isAlive, int cash) {
        this.atmID = atmID;
        this.isAlive = isAlive;
        this.cash = new Cash(cash);
        this.bd=new Bank();
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
