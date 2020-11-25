package ru.example.bank;


import ru.example.atm.Card;

import java.math.BigDecimal;
import java.util.HashMap;

public class Data {

    private HashMap<String, String> accounts = new HashMap<>();
    private HashMap<String, Cash> balance = new HashMap<>();

    public Data() {
        initData();
    }
    
    public Cash getBalance(String cardNumber){
        return balance.get(cardNumber);
    }

    public boolean authentication(Card card){
        return accounts.get(card.getCardNumber()).equals(card.getPin());
    }

    public boolean minusBalance(String cardNumber, BigDecimal sum){
//        Cash oldValue = balance.get(cardNumber);
//        balance.replace(cardNumber, new Cash(oldValue.getBalance().subtract(sum), oldValue.getCurrency()));
        balance.replace(cardNumber, balance.get(cardNumber).subtract(sum));
        return true;
    }

    private void initData(){
        accounts.put("1234567890","1234" );
        accounts.put("1234567891","1235" );
        accounts.put("1234567892","1236" );
        accounts.put("1234567893","1237" );
        accounts.put("1234567894","1238" );

        balance.put("1234567890", new Cash(BigDecimal.valueOf(100), Currency.RUR));
        balance.put("1234567891", new Cash(BigDecimal.valueOf(1000), Currency.KZT));
        balance.put("1234567892", new Cash(BigDecimal.valueOf(-100), Currency.RUR));
        balance.put("1234567893", new Cash(BigDecimal.valueOf(0), Currency.RUR));
        balance.put("1234567894", new Cash(BigDecimal.valueOf(500.63), Currency.RUR));
    }


}
