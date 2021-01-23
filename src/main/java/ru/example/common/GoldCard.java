package ru.example.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@NonNull
@NoArgsConstructor
public class GoldCard extends TypeCard{
    private String nameType = "Gold";
    private double cashbackSize = 0.03;
}
