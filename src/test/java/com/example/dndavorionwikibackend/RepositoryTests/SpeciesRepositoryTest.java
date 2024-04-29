package com.example.dndavorionwikibackend.RepositoryTests;

import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.SpeciesRepositories.SpeciesRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

@DataJpaTest
public class SpeciesRepositoryTest {

    @Autowired
    private SpeciesRepository speciesRepository;

    private Species species;

    @BeforeEach
    public void setUp() {
        species  = new Species();
        species.setSpeciesName("TestSpecies");
        species.setSpeciesDescription("TestSpeciesDescription");
        species.setSpeciesShortDescription("TestSpeciesShortDescription");
        species.setSpeciesImgLink("TestSpeciesImgLink");
        speciesRepository.save(species);
    }

    @Test
    void getAllSpecies() {
        List<Species> speciesList = speciesRepository.findAll();

        assertThat(speciesList).isNotNull();
    }

    @Test
    void getSpeciesById() {
        Optional<Species> species = speciesRepository.findById(1L);
        assertThat(species).isNotNull();
        assertThat(species.get().getSpeciesName()).isEqualTo("TestSpecies");
        assertThat(species.get().getSpeciesDescription()).isEqualTo("TestSpecies");
        assertThat(species.get().getSpeciesShortDescription()).isEqualTo("TestSpeciesShortDescription");
        assertThat(species.get().getSpeciesImgLink()).isEqualTo("TestSpeciesImgLink");

    }

    @Test
    void getSpeciesByName() {
        Optional<Species> species = Optional.ofNullable(speciesRepository.findSpeciesBySpeciesName("TestSpecies"));
        assertThat(species).isNotNull();
        assertThat(species.get().getSpeciesId()).isGreaterThan(0);
        assertThat(species.get().getSpeciesName()).isEqualTo("TestSpecies");
        assertThat(species.get().getSpeciesDescription()).isEqualTo("TestSpecies");
        assertThat(species.get().getSpeciesShortDescription()).isEqualTo("TestSpeciesShortDescription");
        assertThat(species.get().getSpeciesImgLink()).isEqualTo("TestSpeciesImgLink");

    }

    @AfterEach
    public void tearDown() {
        speciesRepository.delete(species);
    }
}
