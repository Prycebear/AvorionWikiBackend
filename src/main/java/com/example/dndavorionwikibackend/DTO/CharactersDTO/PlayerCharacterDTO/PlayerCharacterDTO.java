package com.example.dndavorionwikibackend.DTO.CharactersDTO.PlayerCharacterDTO;

import com.example.dndavorionwikibackend.DTO.CharactersDTO.CharacterSuperDTO;
import com.example.dndavorionwikibackend.Model.Campaign.Campaign;
import com.example.dndavorionwikibackend.Model.User.User;

public class PlayerCharacterDTO extends CharacterSuperDTO {

    private User userId;

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
