package com.example.dndavorionwikibackend.Service.LocationService;

import com.example.dndavorionwikibackend.Model.LocationsModels.Nation;
import com.example.dndavorionwikibackend.Repositories.LocationRepository.NationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NationService {

    private final NationRepository nationRepository;

    public NationService(NationRepository nationRepository) {
        this.nationRepository = nationRepository;
    }


    public Nation save(Nation nation) throws Exception {
        Optional<Nation> savedNation = Optional.ofNullable(nationRepository.findNationByLocationName(nation.getLocationName()));
        if(savedNation.isPresent()){
            throw new Exception("Continent already exist with given name:" + nation.getLocationName());
        }
        return nationRepository.save(nation);
    }

    public List<Nation> findAll() {
        return nationRepository.findAll();
    }

    public Nation findById(long nationId) {
        return nationRepository.findNationsByLocationId(nationId);
    }

    public Nation findByName(String nationName){
        return nationRepository.findNationByLocationName(nationName);
    }
}
