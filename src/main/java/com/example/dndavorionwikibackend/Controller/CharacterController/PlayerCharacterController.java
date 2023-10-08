package com.example.dndavorionwikibackend.Controller.CharacterController;


import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.example.dndavorionwikibackend.Repositories.CharacterRepositories.PlayerCharacterRepository;
import com.example.dndavorionwikibackend.Service.PlayerCharacter.PlayerCharactersService;
import com.example.dndavorionwikibackend.Translation.PlayerCharacterTranslator;
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

    private final PlayerCharactersService playerCharactersService;

    private final PlayerCharacterTranslator playerCharacterTranslator;


    public PlayerCharacterController(PlayerCharactersService playerCharactersService, PlayerCharacterTranslator playerCharacterTranslator, PlayerCharacterRepository playerCharacterRepository) {
        this.playerCharactersService = playerCharactersService;
        this.playerCharacterTranslator = playerCharacterTranslator;
    }


    @CrossOrigin
    @PostMapping("/add")
    public void addPlayerCharacter(@RequestBody PlayerCharacter playerCharacter) {
        playerCharactersService.save(playerCharacter);
        System.out.println("Player character added");
    }



    @CrossOrigin
    @GetMapping(value = "/all")
    public List<PlayerCharacter> listAll() {
        List<PlayerCharacter> listPlayerCharacters = playerCharactersService.findAll();

        return listPlayerCharacters;
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<PlayerCharacter> listById(@PathVariable("id") long playerCharacterId) {
        PlayerCharacter playerCharacter = (PlayerCharacter) playerCharactersService.findById(playerCharacterId);
        return ResponseEntity.ok(playerCharacter);
    }

//    @CrossOrigin
//    @GetMapping("/{speciesName}")
//    public List<PlayerCharacter> listBySpecies(@PathVariable("speciesId") String speciesName) {
//        List<PlayerCharacter> listPlayerCharacter = playerCharacterRepository.findPlayerCharactersBySpecies(speciesName);
//        return listPlayerCharacter;
//    }


    @GetMapping("/test")
    public String speciesTest(){
        return "Test";
    }
}
