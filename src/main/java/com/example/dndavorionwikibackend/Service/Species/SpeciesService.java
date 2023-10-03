package com.example.dndavorionwikibackend.Service.Species;

import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.SpeciesRepositories.SpeciesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeciesService {

    private SpeciesRepository speciesRepository;

    public SpeciesService(SpeciesRepository speciesRepository) {
        this.speciesRepository = speciesRepository;
    }

    public Species save(Species species){
        return speciesRepository.save(species);
    }

    public List<Species> findAll() {
        return speciesRepository.findAll();
    }

    public Species findById(long speciesId) {
        return speciesRepository.findSpeciesBySpeciesId(speciesId);
    }
}
