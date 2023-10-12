package com.example.dndavorionwikibackend.Controller.SpeciesController;


import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Service.SpeciesService.SpeciesService;
import com.example.dndavorionwikibackend.Translation.SpeciesTranslator.SpeciesTranslator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/species")
public class SpeciesController {

    private final SpeciesService speciesService;

    private final SpeciesTranslator speciesTranslator;

    public SpeciesController(SpeciesService speciesService, SpeciesTranslator speciesTranslator) {
        this.speciesService = speciesService;
        this.speciesTranslator = speciesTranslator;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addSpecies(@RequestBody Species species) throws Exception {
        speciesTranslator.speciesToSpeciesDTO(speciesService.save(species));
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public Set<SpeciesDTO> listAll() {
        return speciesService.findAll()
                .stream()
                .map(speciesTranslator::speciesToSpeciesDTO)
                .collect(Collectors.toSet());
    }


    @CrossOrigin
    @GetMapping("/speciesid/{id}")
    public ResponseEntity<SpeciesDTO> listById(@PathVariable("id") long speciesId) {
        return ResponseEntity.ok(speciesTranslator.speciesToSpeciesDTO(speciesService.findById(speciesId)));
    }

    @CrossOrigin
    @GetMapping("/speciesname/{name}")
    public ResponseEntity<SpeciesDTO> listById(@PathVariable("name") String speciesName) {
        return ResponseEntity.ok(speciesTranslator.speciesToSpeciesDTO(speciesService.findByName(speciesName)));
    }

}
