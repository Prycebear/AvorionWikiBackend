package com.example.dndavorionwikibackend.Repositories.LocationRepository;

import com.example.dndavorionwikibackend.Model.Locations.Continent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContinentRepository extends JpaRepository<Continent, Long> {
}
