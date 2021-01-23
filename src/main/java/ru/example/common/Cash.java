package ru.example.common;

//import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
//@AllArgsConstructor
public class Cash {
    @Setter
    private BigDecimal balance;
    private Currency currency;

    public Cash(BigDecimal balance, Currency currency) {
        this.balance = balance;
        this.currency = currency;
    }

    public Cash(int balance){
        this.balance=BigDecimal.valueOf(balance);
        this.currency=Currency.RUR;
    }

    public Cash(int balance, Currency currency){
        this.balance=BigDecimal.valueOf(balance);
        this.currency=currency;
    }

    public Cash subtract(BigDecimal sum) {
        this.balance = this.balance.subtract(sum);
        return this;
    }

    @Override
    public String toString() {
        return this.balance + " " + this.currency;
    }

}
