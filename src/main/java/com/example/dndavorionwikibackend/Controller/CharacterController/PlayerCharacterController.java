package com.example.dndavorionwikibackend.Controller.CharacterController;


import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.CharacterRepositories.PlayerCharacterRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/characters/playercharacters")
public class PlayerCharacterController {

    private final PlayerCharacterRepository playerCharacterRepository;

    public PlayerCharacterController(PlayerCharacterRepository playerCharacterRepository) {
        this.playerCharacterRepository = playerCharacterRepository;
    }


    @CrossOrigin
    @PostMapping("/add")
    public void addPlayerCharacter(@RequestBody PlayerCharacter playerCharacter) {
        playerCharacterRepository.save(playerCharacter);
    }


    @CrossOrigin
    @GetMapping(value = "/all")
    public List<PlayerCharacter> listAll() {
        List<PlayerCharacter> listPlayerCharacters = playerCharacterRepository.findAll();

        return listPlayerCharacters;
    }


    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<PlayerCharacter> listById(@PathVariable("id") long playerCharacterId) {
        PlayerCharacter playerCharacter = playerCharacterRepository.findPlayerCharacterByCharacterId(playerCharacterId);
        return ResponseEntity.ok(playerCharacter);
    }

    @GetMapping("/test")
    public String speciesTest(){
        return "Test";
    }
}