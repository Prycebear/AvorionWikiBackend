package com.example.dndavorionwikibackend.Model.Items.Weapon;

import com.example.dndavorionwikibackend.Model.Items.ItemSuper;

public class Weapon extends ItemSuper {

    public enum WeaponType{
        SWORD,
        AXE,
        MACE,
        LONGBOW,
        BOW,
        SHORTBOW,
        DAGGER,
        FIST,
        SPEAR,
        GLAIVE,
        SCYTHE
    }

    public enum DamageType{
        SLASHING,
        STABBING,
        BLUNT
    }

    public enum DamageDie{
        D2,
        D4,
        D6,
        D8,
        D10,
        D12,
        D20
    }



    private WeaponType weaponType;

    private DamageType damageType;

    private DamageDie damageDie;

    private int dmgDieAmount;



}
