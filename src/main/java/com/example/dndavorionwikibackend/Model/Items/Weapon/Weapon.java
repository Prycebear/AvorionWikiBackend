package com.example.dndavorionwikibackend.Model.Items.Weapon;

import com.example.dndavorionwikibackend.Model.Items.ItemSuper;

import java.util.Set;

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
        SMALL,
        MEDIUM,
        LARGE,
        COLOSSAL
    }

    public enum WeaponProperties{
        LIGHT,
        HEAVY,
        VERSATILE,
        ONE_HANDED,
        TWO_HANDED,
        REACH,
        SWIFT,
        CLEAVE,
        PARRY,
        THROWABLE

    }

    public enum WeaponType{
        DAGGER,
        SHORT_SWORD,
        SWORD,
        lONGSWORD,
        GREATSWORD,
        ZWEIHANDER,
        CLAYMORE


    }

    private WeaponDamageType weaponDamageType;

    private WeaponDiceDamage weaponDiceDamage;

    private Set<WeaponProperties> weaponProperties;

    private WeaponType weaponType;

    private WeaponSize weaponSize;




    public WeaponDamageType getWeaponDamageType() {
        return weaponDamageType;
    }

    public void setWeaponDamageType(WeaponDamageType weaponDamageType) {
        this.weaponDamageType = weaponDamageType;
    }

    public WeaponDiceDamage getWeaponDiceDamage() {
        return weaponDiceDamage;
    }

    public void setWeaponDiceDamage(WeaponDiceDamage weaponDiceDamage) {
        this.weaponDiceDamage = weaponDiceDamage;
    }

    public Set<WeaponProperties> getWeaponProperties() {
        return weaponProperties;
    }

    public void setWeaponProperties(Set<WeaponProperties> weaponProperties) {
        this.weaponProperties = weaponProperties;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponSize getWeaponSize() {
        return weaponSize;
    }

    public void setWeaponSize(WeaponSize weaponSize) {
        this.weaponSize = weaponSize;
    }
}
