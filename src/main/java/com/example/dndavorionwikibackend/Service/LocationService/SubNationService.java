package com.example.dndavorionwikibackend.Service.LocationService;

import com.example.dndavorionwikibackend.Model.LocationsModels.SubNation;
import com.example.dndavorionwikibackend.Repositories.LocationRepository.SubNationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubNationService {
    private final SubNationRepository subNationRepository;

    public SubNationService(SubNationRepository subNationRepository) {
        this.subNationRepository = subNationRepository;
    }

    public SubNation save(SubNation subNation) throws Exception {
        Optional<SubNation> savedSubNation = Optional.ofNullable(subNationRepository.findSubNationByLocationName(subNation.getLocationName()));
        if(savedSubNation.isPresent()){
            throw new Exception("SubNation already exist with given name:" + subNation.getLocationName());
        }
        return subNationRepository.save(subNation);
    }

    public List<SubNation> findAll() {
        return subNationRepository.findAll();
    }

    public SubNation findById(long subNationId) {
        return subNationRepository.findSubNationsByLocationId(subNationId);
    }

    public SubNation findByName(String subNationId){
        return subNationRepository.findSubNationByLocationName(subNationId);
    }
}
