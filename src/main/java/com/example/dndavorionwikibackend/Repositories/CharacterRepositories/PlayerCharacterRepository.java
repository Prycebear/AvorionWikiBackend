package com.example.dndavorionwikibackend.Repositories.CharacterRepositories;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.example.dndavorionwikibackend.Model.Species.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface PlayerCharacterRepository extends JpaRepository<PlayerCharacter, Long> {

    PlayerCharacter findPlayerCharacterByCharacterId(long characterId);

//    List<PlayerCharacter> findPlayerCharactersByGod(long godsId);

//    List<PlayerCharacter> findPlayerCharactersBySpecies(String speciesName);




}
