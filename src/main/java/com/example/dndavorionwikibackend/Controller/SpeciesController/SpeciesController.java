package com.example.dndavorionwikibackend.Controller.SpeciesController;


import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.SpeciesRepositories.SpeciesRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/species")
public class SpeciesController {

    private final SpeciesRepository speciesRepository;

    public SpeciesController(SpeciesRepository speciesRepository) {
        this.speciesRepository = speciesRepository;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addSpecies(@RequestBody Species species) {
        speciesRepository.save(species);
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public List<Species> listAll() {
        List<Species> listSpecies = speciesRepository.findAll();

        return listSpecies;
    }


    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Species> listById(@PathVariable("id") long speciesId) {
        Species species = speciesRepository.findSpeciesBySpeciesId(speciesId);
        return ResponseEntity.ok(species);
    }

    @GetMapping("/test")
    public String speciesTest(){
        return "Test";
    }
}
