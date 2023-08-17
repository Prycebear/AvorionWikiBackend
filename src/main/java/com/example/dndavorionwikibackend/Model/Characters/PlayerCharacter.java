package com.example.dndavorionwikibackend.Model.Characters;

import com.example.dndavorionwikibackend.Model.Campaign.Campaign;
import com.example.dndavorionwikibackend.Model.User.User;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PLAYER_CHARACTER")
public class PlayerCharacter extends CharacterSuper{

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    private User userId;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name="CAMPAIGN_ID")
    private Campaign campaign;

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }
}
