package com.example.dndavorionwikibackend.Model.Locations;

import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;

@MappedSuperclass
public class LocationSuper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LOCATION_ID", nullable = false, unique = true)
    private long locationId;

    private String locationName;

    @Column(columnDefinition = "TEXT")
    private String shortLocationDescription;

    @Column(columnDefinition = "TEXT")
    private String locationDescription;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CHARACTER_ID", referencedColumnName = "CHARACTER_ID")
    private NonPlayerCharacter leaderId;


}
