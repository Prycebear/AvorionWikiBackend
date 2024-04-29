package com.example.dndavorionwikibackend.Service.MagicService;

import com.example.dndavorionwikibackend.Model.Magic.Magic;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.MagicRepository.MagicRepository;
import com.example.dndavorionwikibackend.Repositories.SpeciesRepositories.SpeciesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MagicService {

    private MagicRepository magicRepository;

    public MagicService(MagicRepository magicRepository) {
        this.magicRepository = magicRepository;
    }

    public Magic saveMagic(Magic magic) throws Exception {
        Optional<Magic> savedMagic = magicRepository.findById(magic.getSpellId());
        if (savedMagic.isPresent()) {
            throw new Exception("Spell with this name already exists:" + magic.getSpellId());
        }
        return magicRepository.save(magic);

    }
}
