package com.example.dndavorionwikibackend.Model.Magic;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "MAGIC")
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


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MAGIC_ID", nullable = false, unique = true)
    private long magicId;
    @NonNull
    private String magicName;
    @NonNull
    private String magicDescription;
    @NonNull
    private MagicType magicType;
    @NonNull
    private MagicRange magicRange;
    @NonNull
    private MagicEffect magicEffect;
    @NonNull
    private MagicRadius magicRadius;

    private int magicDiceDamage;

    private int manaCost;

    public long getMagicId() {
        return magicId;
    }

    public void setMagicId(long magicId) {
        this.magicId = magicId;
    }

    public String getMagicName() {
        return magicName;
    }

    public void setMagicName(String magicName) {
        this.magicName = magicName;
    }

    public String getMagicDescription() {
        return magicDescription;
    }

    public void setMagicDescription(String magicDescription) {
        this.magicDescription = magicDescription;
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

    public int getMagicDiceDamage() {
        return magicDiceDamage;
    }

    public void setMagicDiceDamage(int magicDiceDamage) {
        this.magicDiceDamage = magicDiceDamage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }
}
