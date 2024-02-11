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

    @Column(name = "ITEM_NAME")
    private String itemName;

    @Column(name = "ITEM_SHORT_DESCRIPTION")
    private String itemShortDescription;

    @Column(name = "ITEM_DESCRIPTION")
    private String itemDescription;

    @Column(name = "ITEM_VALUE")
    private int value;

    @Column(name = "ITEM_UNIQUE")
    private Boolean itemUnique;


}
