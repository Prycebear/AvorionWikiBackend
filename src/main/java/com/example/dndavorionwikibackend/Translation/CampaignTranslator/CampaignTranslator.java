package com.example.dndavorionwikibackend.Translation.CampaignTranslator;

import com.example.dndavorionwikibackend.DTO.CampaignDTO.CampaignDTO;
import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Campaign.Campaign;
import com.example.dndavorionwikibackend.Model.Species.Species;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CampaignTranslator {

    private ModelMapper modelMapper;

    public CampaignTranslator() {
        this.modelMapper = new ModelMapper();
    }

    public CampaignDTO campaignToCampaignDTO (Campaign campaign){
        return modelMapper.map(campaign, CampaignDTO.class);
    }

    public Campaign CampaignDTOTocampaign (CampaignDTO campaignDTO){
        return modelMapper.map(campaignDTO, Campaign.class);
    }
}
