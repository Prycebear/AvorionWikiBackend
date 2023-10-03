package com.example.dndavorionwikibackend.Service.Species;

import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.SpeciesRepositories.SpeciesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SpeciesService {

    private SpeciesRepository speciesRepository;

    public SpeciesService(SpeciesRepository speciesRepository) {
        this.speciesRepository = speciesRepository;
    }

    public List<Species> findAll() {
        return speciesRepository.findAll();
    }

    public Species findById(long speciesId) {
        return speciesRepository.findSpeciesBySpeciesId(speciesId);
    }
}
