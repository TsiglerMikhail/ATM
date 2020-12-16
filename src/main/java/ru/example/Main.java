package ru.example;

import ru.example.atm.*;
import ru.example.bank.Currency;
import ru.example.bank.DuplicateTransactionException;


public class Main {
    public static void main(String[] args) throws ValidateInputException, DuplicateTransactionException {
        Card testCard = new Card("1234567894111111","1238", new SilverCard());
        Atm testAtm = new Atm("123",true, 99999);
        System.out.println(testAtm.showBalance(testCard));
        System.out.println(testAtm.giveOutCash(testCard, 100));
        System.out.println(testAtm.showBalance(testCard));
        System.out.println(testCard.getTypeCard().getNameType());

    }
}
