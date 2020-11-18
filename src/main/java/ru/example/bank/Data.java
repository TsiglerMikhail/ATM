package ru.example.bank;


import java.math.BigDecimal;
import java.util.HashMap;

public class Data {

    private HashMap<String, String> accounts = new HashMap<>();
    private HashMap<String, BigDecimal> balance = new HashMap<>();

    public String getPin(String cardNumber){
        return accounts.get(cardNumber);
    }

    public BigDecimal getBalance(String cardNumber){
        return balance.get(cardNumber);
    }

    private void initData(){
        accounts.put("1234567890","1234" );
        accounts.put("1234567891","1235" );
        accounts.put("1234567892","1236" );
        accounts.put("1234567893","1237" );
        accounts.put("1234567894","1238" );

        balance.put("1234567890",BigDecimal.valueOf(100));
        balance.put("1234567891",BigDecimal.valueOf(1000));
        balance.put("1234567892",BigDecimal.valueOf(-100));
        balance.put("1234567893",BigDecimal.valueOf(0));
        balance.put("1234567894",BigDecimal.valueOf(500.63));
    }

    public Data() {
        initData();
    }
}
