package com.example.dndavorionwikibackend.Controller.LocationController;


import com.example.dndavorionwikibackend.DTO.LocationDTO.NationsDTO;
import com.example.dndavorionwikibackend.Model.Locations.Nation;
import com.example.dndavorionwikibackend.Service.LocationService.NationService;
import com.example.dndavorionwikibackend.Translation.LocationTranslator.NationTranslator;
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
@RequestMapping("/location/nation")
public class NationController {

    private final NationService nationService;

    private final NationTranslator nationTranslator;


    public NationController(NationService nationService, NationTranslator nationTranslator) {
        this.nationService = nationService;
        this.nationTranslator = nationTranslator;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addNation(@RequestBody Nation nation) throws Exception {
        nationTranslator.nationToNationDTO(nationService.save(nation));
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public Set<NationsDTO> listAll() {
        return nationService.findAll()
                .stream()
                .map(nationTranslator::nationToNationDTO)
                .collect(Collectors.toSet());
    }

    @CrossOrigin
    @GetMapping("/nationId/{id}")
    public ResponseEntity<NationsDTO> listById(@PathVariable("id") long nationId) {
        return ResponseEntity.ok(nationTranslator.nationToNationDTO(nationService.findById(nationId)));
    }

    @CrossOrigin
    @GetMapping("/continentname/{name}")
    public ResponseEntity<NationsDTO> listById(@PathVariable("name") String nationName) {
        return ResponseEntity.ok(nationTranslator.nationToNationDTO(nationService.findByName(nationName)));
    }
}
