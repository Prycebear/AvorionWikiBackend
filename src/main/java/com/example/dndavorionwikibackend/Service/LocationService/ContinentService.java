package com.example.dndavorionwikibackend.Service.LocationService;

import com.example.dndavorionwikibackend.Model.Locations.Continent;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.LocationRepository.ContinentRepository;
import com.example.dndavorionwikibackend.Repositories.SpeciesRepositories.SpeciesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ContinentService {
    private final ContinentRepository continentRepository;


    public ContinentService(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }

    public Continent save(Continent continent) throws Exception {
        Optional<Continent> savedContinent = continentRepository.findById(continent.getLocationId());
        if(savedContinent.isPresent()){
            throw new Exception("Species already exist with given name:" + continent.getLocationName());
        }
        return continentRepository.save(continent);
    }

    public List<Continent> findAll() {
        return continentRepository.findAll();
    }

    public Continent findById(long continentId) {
        return continentRepository.findContinentByLocationId(continentId);
    }

    public Continent findByName(String continentName){
        return continentRepository.findContinentByLocationName(continentName);
    }

    public void deleteById(long continentId) {
        continentRepository.deleteById(continentId);
    }
}

