package com.example.dndavorionwikibackend.Model.Items;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class ItemSuper {

    public enum itemRarity{
        COMMON, UNCOMMON, RARE;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID", nullable = false, unique = true)
    private long itemId;

    private String itemName;

    private String itemDescription;

    private String itemImageURL;

    private int value;

    private boolean legendary;

    private int totalItemAmount;

    private itemRarity rarity;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemImageURL() {
        return itemImageURL;
    }

    public void setItemImageURL(String itemImageURL) {
        this.itemImageURL = itemImageURL;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isLegendary() {
        return legendary;
    }

    public void setLegendary(boolean legendary) {
        this.legendary = legendary;
    }

    public int getTotalItemAmount() {
        return totalItemAmount;
    }

    public void setTotalItemAmount(int totalItemAmount) {
        this.totalItemAmount = totalItemAmount;
    }

    public itemRarity getRarity() {
        return rarity;
    }

    public void setRarity(itemRarity rarity) {
        this.rarity = rarity;
    }
}
