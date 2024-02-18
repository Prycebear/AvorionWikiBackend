package com.example.dndavorionwikibackend.Controller.LocationController;


import com.example.dndavorionwikibackend.DTO.LocationDTO.ContinentDTO;
import com.example.dndavorionwikibackend.Model.LocationsModels.Continent;
import com.example.dndavorionwikibackend.Service.LocationService.ContinentService;
import com.example.dndavorionwikibackend.Translation.LocationTranslator.ContinentTranslator;
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
@RequestMapping("/location/continent")
public class ContinentController {

    private final ContinentService continentService;

    private final ContinentTranslator continentTranslator;


    public ContinentController(ContinentService continentService, ContinentTranslator continentTranslator) {
        this.continentService = continentService;
        this.continentTranslator = continentTranslator;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addContinent(@RequestBody Continent continent) throws Exception {
        continentTranslator.continentToContinentDTO(continentService.save(continent));
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public Set<ContinentDTO> listAll() {
        return continentService.findAll()
                .stream()
                .map(continentTranslator::continentToContinentDTO)
                .collect(Collectors.toSet());
    }

    @CrossOrigin
    @GetMapping("/continentId/{id}")
    public ResponseEntity<ContinentDTO> listById(@PathVariable("id") long continentId) {
        return ResponseEntity.ok(continentTranslator.continentToContinentDTO(continentService.findById(continentId)));
    }

    @CrossOrigin
    @GetMapping("/continentname/{name}")
    public ResponseEntity<ContinentDTO> listById(@PathVariable("name") String continentName) {
        return ResponseEntity.ok(continentTranslator.continentToContinentDTO(continentService.findByName(continentName)));
    }
}
