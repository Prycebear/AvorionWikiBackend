package com.example.dndavorionwikibackend.Model.Items.Resources.Plant;

import com.example.dndavorionwikibackend.Model.Items.ItemSuper;

public class Plant extends ItemSuper {

    public enum plantType{
        HERB,
        ROOT,
        FRUIT,
        VEGETABLE,
        BARK,
        MOSS,
        FUNGUS
    }

    public enum plantEffects{
        HEAL,
        DAMAGE,
        TRANSFORM
    }

    public enum plantEffectsType{
        INSTANT,
        DELAYED,
        EFFECT_OVER_TIME
    }

    public enum growingEnvironment{
        GRASSLAND,
        FOREST,
        MOUNTAIN,
        OCEAN,
        RIVER,
        LAKE,
        DESERT,
        CITY,
        COAST

    }



    private boolean edible;

    private int effectAmount;

    private plantEffectsType plantEffectsType;

    private plantType plantType;

    private plantEffects plantEffects;

    private growingEnvironment growingEnvironment;

    public boolean isEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public int getEffectAmount() {
        return effectAmount;
    }

    public void setEffectAmount(int effectAmount) {
        this.effectAmount = effectAmount;
    }

    public Plant.plantEffectsType getPlantEffectsType() {
        return plantEffectsType;
    }

    public void setPlantEffectsType(Plant.plantEffectsType plantEffectsType) {
        this.plantEffectsType = plantEffectsType;
    }

    public Plant.plantType getPlantType() {
        return plantType;
    }

    public void setPlantType(Plant.plantType plantType) {
        this.plantType = plantType;
    }

    public Plant.plantEffects getPlantEffects() {
        return plantEffects;
    }

    public void setPlantEffects(Plant.plantEffects plantEffects) {
        this.plantEffects = plantEffects;
    }

    public Plant.growingEnvironment getGrowingEnvironment() {
        return growingEnvironment;
    }

    public void setGrowingEnvironment(Plant.growingEnvironment growingEnvironment) {
        this.growingEnvironment = growingEnvironment;
    }
}
