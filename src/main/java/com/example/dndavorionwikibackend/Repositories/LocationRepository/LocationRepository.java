package com.example.dndavorionwikibackend.Repositories.LocationRepository;

import com.example.dndavorionwikibackend.Model.LocationsModels.Locations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Locations, Long> {

    Locations findLocationsByLocationId(long locationId);

    Locations findLocationsByLocationName(String locationName);
}
