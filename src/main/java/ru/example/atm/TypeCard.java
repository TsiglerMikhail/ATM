package ru.example.atm;

import lombok.Getter;
import lombok.NonNull;

@Getter
@NonNull
public class TypeCard {
    private String nameType;
    private double cashbackSize;
}
