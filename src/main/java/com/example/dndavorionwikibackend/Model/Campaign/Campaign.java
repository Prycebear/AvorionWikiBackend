package com.example.dndavorionwikibackend.Model.Campaign;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column(name="CAMPAIGN_TYPE")
    private String campaignType;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "CAMPAIGN_ID")
    private Set<Session> sessions;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "CAMPAIGN_ID")
    private Set<PlayerCharacter> playerCharacters;


    public long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignType() {
        return campaignType;
    }

    public void setCampaignType(String campaignType) {
        this.campaignType = campaignType;
    }

    public Set<Session> getSessions() {
        return sessions;
    }

    public void setSessions(Set<Session> sessions) {
        this.sessions = sessions;
    }

    public Set<PlayerCharacter> getPlayerCharacters() {
        return playerCharacters;
    }

    public void setPlayerCharacters(Set<PlayerCharacter> playerCharacters) {
        this.playerCharacters = playerCharacters;
    }
}
