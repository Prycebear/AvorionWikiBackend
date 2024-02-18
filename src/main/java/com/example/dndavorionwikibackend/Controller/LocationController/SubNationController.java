package com.example.dndavorionwikibackend.Controller.LocationController;

import com.example.dndavorionwikibackend.DTO.LocationDTO.NationsDTO;
import com.example.dndavorionwikibackend.DTO.LocationDTO.SubNationDTO;
import com.example.dndavorionwikibackend.Model.LocationsModels.Nation;
import com.example.dndavorionwikibackend.Model.LocationsModels.SubNation;
import com.example.dndavorionwikibackend.Service.LocationService.NationService;
import com.example.dndavorionwikibackend.Service.LocationService.SubNationService;
import com.example.dndavorionwikibackend.Translation.LocationTranslator.NationTranslator;
import com.example.dndavorionwikibackend.Translation.LocationTranslator.SubNationTranslator;
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
@RequestMapping("/location/subnation")
public class SubNationController {

    private final SubNationService subNationService;

    private final SubNationTranslator subNationTranslator;

    public SubNationController(SubNationService subNationService, SubNationTranslator subNationTranslator) {
        this.subNationService = subNationService;
        this.subNationTranslator = subNationTranslator;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addNation(@RequestBody SubNation subNation) throws Exception {
        subNationTranslator.subNationToSubNationDTO(subNationService.save(subNation));
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public Set<SubNationDTO> listAll() {
        return subNationService.findAll()
                .stream()
                .map(subNationTranslator::subNationToSubNationDTO)
                .collect(Collectors.toSet());
    }

    @CrossOrigin
    @GetMapping("/subnationId/{id}")
    public ResponseEntity<SubNationDTO> listById(@PathVariable("id") long subNationId) {
        return ResponseEntity.ok(subNationTranslator.subNationToSubNationDTO(subNationService.findById(subNationId)));
    }

    @CrossOrigin
    @GetMapping("/subcontinentname/{name}")
    public ResponseEntity<SubNationDTO> listById(@PathVariable("name") String subNationName) {
        return ResponseEntity.ok(subNationTranslator.subNationToSubNationDTO(subNationService.findByName(subNationName)));
    }


}
