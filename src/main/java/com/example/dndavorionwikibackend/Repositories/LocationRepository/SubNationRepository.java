package com.example.dndavorionwikibackend.Repositories.LocationRepository;

import com.example.dndavorionwikibackend.Model.LocationsModels.SubNation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubNationRepository extends JpaRepository<SubNation, Long> {
    SubNation findSubNationsByLocationId(long subNationId);

    SubNation findSubNationByLocationName(String subNationName);
}
