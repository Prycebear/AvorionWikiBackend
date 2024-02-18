package com.example.dndavorionwikibackend.Repositories.LocationRepository;

import com.example.dndavorionwikibackend.Model.LocationsModels.Nation;
import com.example.dndavorionwikibackend.Model.LocationsModels.PointOfInterest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointsOfInterestRepository extends JpaRepository<PointOfInterest, Long> {

    PointOfInterest findPointOfInterestByLocationId(long PointOfInterestId);

    PointOfInterest findPointOfInterestByLocationName(String pointOfInterestName);
}
