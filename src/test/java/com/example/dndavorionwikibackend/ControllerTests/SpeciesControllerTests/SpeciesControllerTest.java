package com.example.dndavorionwikibackend.ControllerTests.SpeciesControllerTests;

import com.example.dndavorionwikibackend.Controller.SpeciesController.SpeciesController;
import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Service.SpeciesService.SpeciesService;
import com.example.dndavorionwikibackend.Translation.SpeciesTranslator.SpeciesTranslator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SpeciesControllerTest {

    @Mock
    private SpeciesService speciesService;

    @Mock
    private SpeciesTranslator speciesTranslator;

    @InjectMocks
    private SpeciesController speciesController;

    @Test
    void testListById() {
        // Arrange
        long speciesId = 1L;
        Species species = new Species();  // Replace 'Species' with the actual class used in your application
        SpeciesDTO expectedSpeciesDTO = new SpeciesDTO();  // Replace 'SpeciesDTO' with the actual DTO class

        when(speciesService.findById(speciesId)).thenReturn(species);
        when(speciesTranslator.speciesToSpeciesDTO(species)).thenReturn(expectedSpeciesDTO);

        // Act
        ResponseEntity<SpeciesDTO> responseEntity = speciesController.listById(speciesId);

        // Assert
        assertEquals(expectedSpeciesDTO, responseEntity.getBody());
        assertEquals(200, responseEntity.getStatusCodeValue());

        // Verify that the service method and translator method were called
        verify(speciesService, times(1)).findById(speciesId);
        verify(speciesTranslator, times(1)).speciesToSpeciesDTO(species);
    }
}
