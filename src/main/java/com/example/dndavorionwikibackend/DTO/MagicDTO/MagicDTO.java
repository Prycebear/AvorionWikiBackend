package com.example.dndavorionwikibackend.DTO.MagicDTO;

import com.example.dndavorionwikibackend.Model.Magic.Magic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class MagicDTO {

    private long magicId;

    private String magicName;

    private String magicDescription;

    private Magic.MagicType magicType;

    private Magic.MagicRange magicRange;

    private Magic.MagicEffect magicEffect;

    private Magic.MagicRadius magicRadius;

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
