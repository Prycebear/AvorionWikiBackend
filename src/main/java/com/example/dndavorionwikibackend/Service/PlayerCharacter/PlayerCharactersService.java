package com.example.dndavorionwikibackend.Service.PlayerCharacter;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.CharacterRepositories.PlayerCharacterRepository;
import com.example.dndavorionwikibackend.Repositories.SpeciesRepositories.SpeciesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerCharactersService {

    private PlayerCharacterRepository playerCharacterRepository;

    public PlayerCharactersService(PlayerCharacterRepository playerCharacterRepository) {
        this.playerCharacterRepository = playerCharacterRepository;
    }

    public PlayerCharacter save(PlayerCharacter playerCharacter) {
        return playerCharacterRepository.save(playerCharacter);
    }

    public List<PlayerCharacter> findAll() {
        return playerCharacterRepository.findAll();
    }

    public PlayerCharacter findById(long playerCharacterId) {
        return playerCharacterRepository.findPlayerCharacterByCharacterId(playerCharacterId);
    }
}

