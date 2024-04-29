package com.example.dndavorionwikibackend.Model.Items.Weapon;

import com.example.dndavorionwikibackend.Model.Items.ItemSuper;

public class Weapon extends ItemSuper {

    public enum WeaponDamageType{
        SLASHING,
        PIERCING,
        BLUDGEONING,
    }

    public enum WeaponDiceDamage{
        D1,
        D2,
        D4,
        D6,
        D8,
        D10,
        D12,
        D20
    }

    public enum WeaponSize{

    }

    private WeaponDamageType weaponDamageType;

    private WeaponDiceDamage weaponDiceDamage;

    private boolean throwable;





}
