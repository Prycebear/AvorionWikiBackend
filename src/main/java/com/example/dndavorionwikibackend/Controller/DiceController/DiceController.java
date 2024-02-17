package com.example.dndavorionwikibackend.Controller.DiceController;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.example.dndavorionwikibackend.Service.DiceService.DiceRoller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dice")
public class DiceController {


    @CrossOrigin
    @GetMapping("/{dicetype}")
    public int listById(@PathVariable("dicetype") int diceValue) {
        DiceRoller diceRoller = new DiceRoller();
        return diceRoller.diceRoll(diceValue);
    }
}
