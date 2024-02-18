package com.example.dndavorionwikibackend.Service.LocationService;

import com.example.dndavorionwikibackend.Model.LocationsModels.Locations;
import com.example.dndavorionwikibackend.Model.LocationsModels.PointOfInterest;
import com.example.dndavorionwikibackend.Repositories.LocationRepository.LocationRepository;
import com.example.dndavorionwikibackend.Repositories.LocationRepository.PointsOfInterestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PointsOfInterestService {

    private PointsOfInterestRepository pointsOfInterestRepository;

    public PointsOfInterestService(PointsOfInterestRepository pointsOfInterestRepository) {
        this.pointsOfInterestRepository = pointsOfInterestRepository;
    }

    public PointOfInterest save(PointOfInterest pointOfInterest) throws Exception {
        return pointsOfInterestRepository.save(pointOfInterest);
    }

    public List<PointOfInterest> findAll() {
        return pointsOfInterestRepository.findAll();
    }

    public PointOfInterest findById(long pointOfInterestId) {
        return pointsOfInterestRepository.findPointOfInterestByLocationId(pointOfInterestId);
    }

    public PointOfInterest findByName(String pointOfInterestName){
        return pointsOfInterestRepository.findPointOfInterestByLocationName(pointOfInterestName);
    }
}
