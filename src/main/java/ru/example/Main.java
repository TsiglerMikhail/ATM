package ru.example;

import ru.example.atm.Atm;
import ru.example.atm.User;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        User testUser = new User("1234567894","1238" );
        Atm testAtm = new Atm("123",true, BigDecimal.valueOf(99999));
        System.out.println(testAtm.getBalance(testUser));

    }
}
