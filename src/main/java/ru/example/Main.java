package ru.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.example.atm.*;
import ru.example.bank.Bank;
import ru.example.bank.DuplicateTransactionException;
import ru.example.common.Card;
import ru.example.common.SilverCard;


public class Main {
    public static void main(String[] args) throws ValidateInputException, DuplicateTransactionException {
        Card testCard = new Card("1234567894111111","1238", new SilverCard());
        Atm testAtm = new Atm("123",true, 99999);
        System.out.println(testAtm.showBalance(testCard));
        System.out.println(testAtm.giveOutCash(testCard, 100));
        System.out.println(testAtm.showBalance(testCard));
        System.out.println(testCard.getTypeCard().getNameType());

        ApplicationContext context =
                new AnnotationConfigApplicationContext("ru.example");

        Bank bank = context.getBean(Bank.class);
        System.out.println(bank.getBalance("1234567890111111"));
        Atm beanAtm = context.getBean(Atm.class);
        System.out.println(beanAtm.showBalance(testCard));

    }
}
