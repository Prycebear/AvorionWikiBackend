package com.example.dndavorionwikibackend.Translation.CampaignTranslator;

import com.example.dndavorionwikibackend.DTO.CampaignDTO.SessionDTO;
import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Campaign.Session;
import com.example.dndavorionwikibackend.Model.Species.Species;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SessionTranslator {

    private ModelMapper modelMapper;

    public SessionTranslator() {
        this.modelMapper = new ModelMapper();
    }

    public SessionDTO sessionToSessionDTO (Session session){
        return modelMapper.map(session, SessionDTO.class);
    }

    public Session SessionDTOToSpecies (SessionDTO sessionDTO){
        return modelMapper.map(sessionDTO, Session.class);
    }
}
