package com.example.dndavorionwikibackend.DTO.CampaignDTO;

import com.example.dndavorionwikibackend.Model.Campaign.Session;
import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.Set;

public class CampaignDTO {

    private long campaignId;

    private String campaignName;

    private String campaignType;

    private Set<Session> sessions;

    private Set<PlayerCharacter> playerCharacters;

    public long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }
}
