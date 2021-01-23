package ru.example.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@NonNull
@NoArgsConstructor
public class SilverCard extends TypeCard{
    private String nameType = "Silver";
    private double cashbackSize = 0.01;
}
