package com.example.dndavorionwikibackend.DTO.CampaignDTO;

import com.example.dndavorionwikibackend.Model.Campaign.Campaign;
import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import jakarta.persistence.*;

import java.util.Set;

public class SessionDTO {


    private long sessionId;

    private String sessionTitle;

    private String shortSessionDescription;

    private Campaign campaign;

    private Set<NonPlayerCharacter> nonPlayerCharacters;

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionTitle() {
        return sessionTitle;
    }

    public void setSessionTitle(String sessionTitle) {
        this.sessionTitle = sessionTitle;
    }

    public String getShortSessionDescription() {
        return shortSessionDescription;
    }

    public void setShortSessionDescription(String shortSessionDescription) {
        this.shortSessionDescription = shortSessionDescription;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public Set<NonPlayerCharacter> getNonPlayerCharacters() {
        return nonPlayerCharacters;
    }

    public void setNonPlayerCharacters(Set<NonPlayerCharacter> nonPlayerCharacters) {
        this.nonPlayerCharacters = nonPlayerCharacters;
    }
}
