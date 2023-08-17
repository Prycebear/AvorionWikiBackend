package com.example.dndavorionwikibackend.Controller;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/tests")
public class TrialController {

    @CrossOrigin
    @GetMapping(value = "/all")
    public void all() {


    }

    @CrossOrigin
    @GetMapping(value = "/[role]")
    public void role() {


    }
}
