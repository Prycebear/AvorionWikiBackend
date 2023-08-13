package com.example.dndavorionwikibackend.Repositories.SpeciesRepositories;

import com.example.dndavorionwikibackend.Model.Species.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Long> {

    Species findSpeciesBySpeciesId(long speciesId);

}
