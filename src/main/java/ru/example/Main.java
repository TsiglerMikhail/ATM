package ru.example;

import ru.example.atm.Atm;
import ru.example.atm.Card;
import ru.example.bank.Currency;



public class Main {
    public static void main(String[] args) {
        Card testCard = new Card("1234567894","1238" );
        Atm testAtm = new Atm("123",true, 99999);
        System.out.println(testAtm.showBalance(testCard));
        System.out.println(testAtm.giveOutCash(testCard, 100));
        System.out.println(testAtm.showBalance(testCard));


    }
}
