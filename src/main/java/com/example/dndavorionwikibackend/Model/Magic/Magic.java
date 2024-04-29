package com.example.dndavorionwikibackend.Model.Magic;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Magic{

    public enum MagicType{
        ELEMENTAL,
        LIFE,
        CONJURATION,
        ENCHANTMENT,
        TEMPORAL,
        TRANSMUTATION

    }

    public enum MagicRange{
        CLOSE_QUARTERS,
        NEAR,
        FAR,
        REMOTE
    }


    public enum MagicEffect{
        DAMAGE,
        HEAL,
        PUSH,
        PULL,
        ENCHANT,
        DISENCHANT,
        SUMMON,
        ILLUSION,
        TRANSMUTATION,
        RANDOM
    }

    public enum MagicRadius{
        SINGLE,
        MULTIPLE,
        CHAINED,
        CONE,
        SPHERE
    }



    public enum MagicDiceDamage{
        D1,
        D2,
        D4,
        D6,
        D8,
        D10,
        D12,
        D20
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MAGIC_ID", nullable = false, unique = true)
    private long magicId;

    private String spellName;

    private String spellDescription;

    private MagicType magicType;

    private MagicRange magicRange;

    private MagicEffect magicEffect;

    private MagicRadius magicRadius;

    private MagicDiceDamage magicDiceDamage;

    private int manaCost;

    public long getMagicId() {
        return magicId;
    }

    public void setMagicId(long magicId) {
        this.magicId = magicId;
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

    public MagicType getMagicType() {
        return magicType;
    }

    public void setMagicType(MagicType magicType) {
        this.magicType = magicType;
    }

    public MagicRange getMagicRange() {
        return magicRange;
    }

    public void setMagicRange(MagicRange magicRange) {
        this.magicRange = magicRange;
    }

    public MagicEffect getMagicEffect() {
        return magicEffect;
    }

    public void setMagicEffect(MagicEffect magicEffect) {
        this.magicEffect = magicEffect;
    }

    public MagicRadius getMagicRadius() {
        return magicRadius;
    }

    public void setMagicRadius(MagicRadius magicRadius) {
        this.magicRadius = magicRadius;
    }

    public MagicDiceDamage getMagicDiceDamage() {
        return magicDiceDamage;
    }

    public void setMagicDiceDamage(MagicDiceDamage magicDiceDamage) {
        this.magicDiceDamage = magicDiceDamage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }
}
