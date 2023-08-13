package com.example.dndavorionwikibackend.Model.Items;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class ItemSuper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID", nullable = false, unique = true)
    private long itemId;

    private String itemName;

    private String itemDescription;

    private int value;

    private int totalItemAmount;


}
