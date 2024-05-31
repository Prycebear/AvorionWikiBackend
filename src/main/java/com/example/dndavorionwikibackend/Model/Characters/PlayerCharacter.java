package com.example.dndavorionwikibackend.Model.Characters;

import com.example.dndavorionwikibackend.Model.Campaign.Campaign;
import com.example.dndavorionwikibackend.Model.User.User;
import jakarta.persistence.*;

@Entity
@Table(name = "PLAYER_CHARACTER")
public class PlayerCharacter extends CharacterSuper{


    @ManyToOne(optional = true)
    @JoinColumn(name="USER_ID")
    private User userId;

    @ManyToOne(optional = true)
    @JoinColumn(name="CAMPAIGN_ID")
    private Campaign campaign;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private CharacterStats characterStats;

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
