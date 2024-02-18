package com.example.dndavorionwikibackend.Repositories.LocationRepository;

import com.example.dndavorionwikibackend.Model.LocationsModels.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {

    Continent findContinentByLocationId(long continentId);

    Continent findContinentByLocationName(String continentName);
}
