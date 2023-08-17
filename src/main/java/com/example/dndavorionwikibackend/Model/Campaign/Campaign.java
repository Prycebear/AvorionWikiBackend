package com.example.dndavorionwikibackend.Model.Campaign;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "CAMPAIGN")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAMPAIGN_ID", nullable = false, unique = true)
    private long campaignId;

    @Column(name="CAMPAIGN_NAME")
    private String campaignName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CAMPAIGN_ID")
    private Set<Session> sessions;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CAMPAIGN_ID")
    private Set<PlayerCharacter> playerCharacters;


}
