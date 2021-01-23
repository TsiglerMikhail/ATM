package ru.example.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ru.example.atm.ValidateInputException;


@Getter
@NonNull
@NoArgsConstructor
public class Card<T extends TypeCard > {
    private String cardNumber;
    private String pin;
    private T typeCard;


    public Card(String cardNumber, String pin, T typeCard) throws ValidateInputException {

        if(cardNumber.matches("^[0-9]{16}$")) {
            this.cardNumber = cardNumber;
        }
        else {
            throw new ValidateInputException("Не корректный номер карты");
        }
        if (pin.matches("^[0-9]{4}$")) {
            this.pin = pin;
        }
        else {
            throw new ValidateInputException("Не корректный пин");
        }

        this.typeCard=typeCard;

    }



}
