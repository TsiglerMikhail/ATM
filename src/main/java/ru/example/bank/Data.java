package ru.example.bank;


import ru.example.atm.Card;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;

public class Data {

    private HashMap<String, String> accounts = new HashMap<>();
    private HashMap<String, Cash> balance = new HashMap<>();
    private HashSet<Transaction> transactions = new HashSet<>();


    public Data() {
        initData();
    }
    
    public Cash getBalance(String cardNumber){
        transactions.add(new Transaction(cardNumber, TransactionType.GETBALANCE));
        return balance.get(cardNumber);
    }

    public boolean authentication(Card card){
        if(accounts.containsKey(card.getCardNumber())) {
            return accounts.get(card.getCardNumber()).equals(card.getPin());
        }
        return false;
    }

    public boolean minusBalance(String cardNumber, BigDecimal sum){
//        Cash oldValue = balance.get(cardNumber);
//        balance.replace(cardNumber, new Cash(oldValue.getBalance().subtract(sum), oldValue.getCurrency()));
        transactions.add(new Transaction(cardNumber, TransactionType.GIVEOUTCASH));
        balance.replace(cardNumber, balance.get(cardNumber).subtract(sum));
        return true;
    }

    private void initData(){
        accounts.put("1234567890111111","1234" );
        accounts.put("1234567891111111","1235" );
        accounts.put("1234567892111111","1236" );
        accounts.put("1234567893111111","1237" );
        accounts.put("1234567894111111","1238" );

        balance.put("1234567890111111", new Cash(BigDecimal.valueOf(100), Currency.RUR));
        balance.put("1234567891111111", new Cash(BigDecimal.valueOf(1000), Currency.KZT));
        balance.put("1234567892111111", new Cash(BigDecimal.valueOf(-100), Currency.RUR));
        balance.put("1234567893111111", new Cash(BigDecimal.valueOf(0), Currency.RUR));
        balance.put("1234567894111111", new Cash(BigDecimal.valueOf(500.63), Currency.RUR));


    }


}
