package com.example.dndavorionwikibackend.Service.LocationService;

import com.example.dndavorionwikibackend.Model.LocationsModels.Locations;
import com.example.dndavorionwikibackend.Repositories.LocationRepository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Locations save(Locations locations) throws Exception {
        return locationRepository.save(locations);
    }

    public List<Locations> findAll() {
        return locationRepository.findAll();
    }

    public Locations findById(long locationId) {
        return locationRepository.findLocationsByLocationId(locationId);
    }

    public Locations findByName(String locationName){
        return locationRepository.findLocationsByLocationName(locationName);
    }
}

