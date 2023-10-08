package com.example.dndavorionwikibackend.Repositories.CharacterRepositories;

import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NonPlayerCharacterInterface extends CrudRepository<NonPlayerCharacter, Long> {

    NonPlayerCharacter findPlayerNonCharacterByCharacterId(long characterId);

    List<NonPlayerCharacter> findNonPlayerCharactersByGod(long godsId);

    List<NonPlayerCharacter> findNonPlayerCharactersBySpecies(String speciesName);
}
