package com.example.dndavorionwikibackend.Translation.PlayerCharacterTranslator;

import com.example.dndavorionwikibackend.DTO.CharactersDTO.PlayerCharacterDTO.PlayerCharacterDTO;
import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class PlayerCharacterTranslator {

    private ModelMapper modelMapper;

    public PlayerCharacterTranslator(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PlayerCharacterDTO playerCharacterToPlayerCharacterDTO (PlayerCharacter playerCharacter){
        return modelMapper.map(playerCharacter, PlayerCharacterDTO.class);
    }

    public PlayerCharacter playerCharacterDTOtoPlayerCharacter (PlayerCharacterDTO playerCharacterDTO){
        return modelMapper.map(playerCharacterDTO, PlayerCharacter.class);
    }
}
