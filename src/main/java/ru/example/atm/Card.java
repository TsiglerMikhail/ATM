package ru.example.atm;

//import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
//@AllArgsConstructor
public class Card {

    private final String cardNumber;
    private final String pin;

    public Card(String cardNumber, String pin) throws ValidateInputException{
        // 292Шилд
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

    }
}
