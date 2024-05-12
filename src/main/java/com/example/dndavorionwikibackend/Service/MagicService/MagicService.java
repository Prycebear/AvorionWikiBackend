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
        Optional<Magic> savedMagic = magicRepository.findById(magic.getMagicId());
        if (savedMagic.isPresent()) {
            throw new Exception("Spell with this name already exists:" + magic.getMagicId());
        }
        magic.setManaCost(MagicService.manaCost(magic));
        return magicRepository.save(magic);

    }
    public List<Magic> findAll() {
        return magicRepository.findAll();
    }

    public Magic findMagicById(long magicId) throws Exception {
        return magicRepository.findMagicByMagicId(magicId);
    }

    public Magic findMagicByName(String magicName) throws Exception {
        return magicRepository.findMagicByMagicName(magicName);
    }

    public static int manaCost(Magic magic) {
        int manaCost = 0;
        manaCost += MagicService.magictypeValue(magic);
        manaCost += MagicService.magicRangeValue(magic);
        manaCost += MagicService.magicEffectValue(magic);
        manaCost *= MagicService.magicRadiusValue(magic);
        manaCost *= MagicService.magicDamageValue(magic);
        return manaCost;
    }

    public static int magictypeValue(Magic magic) {
        String magicTypeString = String.valueOf(magic.getMagicType());
        switch (magicTypeString){
            case "ELEMENTAL":
                return 1;
            case "LIFE", "TRANSMUTATION", "CONJURATION", "ENCHANTMENT":
                return 2;
        }
        return 5;
    }

    public static int magicRangeValue(Magic magic) {
        String magicRangeString = String.valueOf(magic.getMagicRange());
        switch (magicRangeString){
            case "CLOSE_QUARTERS":
                return 1;
            case "NEAR":
                return 2;
            case "FAR":
                return 3;
        }
        return 5;
    }

    public static int magicEffectValue(Magic magic) {
        String magicEffectString = String.valueOf(magic.getMagicEffect());
        switch (magicEffectString){
            case "DAMAGE", "RANDOM", "HEAL":
                return 1;
            case "PUSH", "PULL":
                return 2;
            case "ENCHANT", "ILLUSION", "TRANSMUTATION":
                return 3;
            case "DISENCHANT", "SUMMON":
                return 5;

        }
        return 0;
    }
    public static int magicRadiusValue(Magic magic) {
        String magicRadiusString = String.valueOf(magic.getMagicRadius());
        switch (magicRadiusString){
            case "SINGLE":
                return 1;
            case "MULTIPLE":
                return 5;
            case "CHAINED":
                return 4;
            case "CONE":
                return 2;
            case "SPHERE":
                return 3;
        }
        return 0;
    }

    public static int magicDamageValue(Magic magic) {
        int magicDamage = magic.getMagicDiceDamage();
        return magicDamage;
    }
}
