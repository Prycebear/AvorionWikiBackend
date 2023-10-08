package com.example.dndavorionwikibackend.Service.Species;

import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.SpeciesRepositories.SpeciesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpeciesService {

    private SpeciesRepository speciesRepository;

    public SpeciesService(SpeciesRepository speciesRepository) {
        this.speciesRepository = speciesRepository;
    }

    public Species save(Species species) throws Exception {
        Optional<Species> savedSpecies = speciesRepository.findById(species.getSpeciesId());
        if(savedSpecies.isPresent()){
            throw new Exception("Employee already exist with given name:" + species.getSpeciesName());
        }
        return speciesRepository.save(species);
    }

    public List<Species> findAll() {
        return speciesRepository.findAll();
    }

    public Species findById(long speciesId) {
        return speciesRepository.findSpeciesBySpeciesId(speciesId);
    }
}
