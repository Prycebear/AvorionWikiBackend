package com.example.dndavorionwikibackend.ControllerTests;

import com.example.dndavorionwikibackend.Controller.SpeciesController.SpeciesController;
import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.SpeciesRepositories.SpeciesRepository;

import com.example.dndavorionwikibackend.Service.SpeciesService.SpeciesService;
import com.example.dndavorionwikibackend.Translation.SpeciesTranslator.SpeciesTranslator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;




@DataJpaTest
public class SpeciesControllerTest {

private SpeciesRepository speciesRepository;
private SpeciesController speciesController;
private Species species;
private SpeciesTranslator speciesTranslator;
    @Autowired
    private SpeciesService speciesService;

    @BeforeEach
public void setUp() {
    species = new Species();
        species.setSpeciesName("TestSpecies");
        species.setSpeciesDescription("TestSpeciesDescription");
        species.setSpeciesShortDescription("TestSpeciesShortDescription");
        species.setSpeciesImgLink("TestSpeciesImgLink");
}

@Test
public void testAddSpecies() throws Exception {
    speciesController.addSpecies(species);

    assertThat(species).isNotNull();
    assertThat(species.getSpeciesId()).isGreaterThan(0);
    assertThat(species.getSpeciesName()).isEqualTo(species.getSpeciesName());
    assertThat(species.getSpeciesDescription()).isEqualTo(species.getSpeciesDescription());
    assertThat(species.getSpeciesShortDescription()).isEqualTo(species.getSpeciesShortDescription());
    assertThat(species.getSpeciesImgLink()).isEqualTo(species.getSpeciesImgLink());

}

}
