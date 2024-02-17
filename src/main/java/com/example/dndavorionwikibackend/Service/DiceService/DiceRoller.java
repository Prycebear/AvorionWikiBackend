package com.example.dndavorionwikibackend.Service.DiceService;

import org.springframework.stereotype.Service;

@Service
public class DiceRoller {

    public int diceRoll(int diceValue){
        return (int) ((Math.random() * (diceValue - 1)) + 1);
    }
}
