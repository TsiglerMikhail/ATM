package ru.example.bank;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Transaction {
    private String cardNumber;
    private TransactionType type;
}
