package com.example.dndavorionwikibackend.DTO.MagicDTO;

import com.example.dndavorionwikibackend.Model.Magic.Magic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class MagicDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SPELL_ID", nullable = false, unique = true)
    private long spellId;

    private String spellName;

    private String spellDescription;

    private Magic.MagicType magicType;

    private Magic.MagicRange magicRange;

    private Magic.MagicEffect magicEffect;

    private Magic.MagicRadius magicRadius;

    private Magic.MagicDiceDamage magicDiceDamage;

    private int manaCost;

    public long getSpellId() {
        return spellId;
    }

    public void setSpellId(long spellId) {
        this.spellId = spellId;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public String getSpellDescription() {
        return spellDescription;
    }

    public void setSpellDescription(String spellDescription) {
        this.spellDescription = spellDescription;
    }

    public Magic.MagicType getMagicType() {
        return magicType;
    }

    public void setMagicType(Magic.MagicType magicType) {
        this.magicType = magicType;
    }

    public Magic.MagicRange getMagicRange() {
        return magicRange;
    }

    public void setMagicRange(Magic.MagicRange magicRange) {
        this.magicRange = magicRange;
    }

    public Magic.MagicEffect getMagicEffect() {
        return magicEffect;
    }

    public void setMagicEffect(Magic.MagicEffect magicEffect) {
        this.magicEffect = magicEffect;
    }

    public Magic.MagicRadius getMagicRadius() {
        return magicRadius;
    }

    public void setMagicRadius(Magic.MagicRadius magicRadius) {
        this.magicRadius = magicRadius;
    }

    public Magic.MagicDiceDamage getMagicDiceDamage() {
        return magicDiceDamage;
    }

    public void setMagicDiceDamage(Magic.MagicDiceDamage magicDiceDamage) {
        this.magicDiceDamage = magicDiceDamage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }
}
