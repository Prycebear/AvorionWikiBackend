package com.example.dndavorionwikibackend.Controller.LocationController;


import com.example.dndavorionwikibackend.DTO.LocationDTO.ContinentDTO;
import com.example.dndavorionwikibackend.Model.Locations.Continent;
import com.example.dndavorionwikibackend.Service.LocationService.ContinentService;
import com.example.dndavorionwikibackend.Translation.LocationTranslator.ContinentTranslator;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/location/continent")
public class ContinentController {

    private final ContinentService continentRepository;

    private final ContinentTranslator continentTranslator;
    private final ContinentService continentService;


    public ContinentController(ContinentService continentRepository, ContinentTranslator continentTranslator, ContinentService continentService) {
        this.continentRepository = continentRepository;
        this.continentTranslator = continentTranslator;
        this.continentService = continentService;
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


}
