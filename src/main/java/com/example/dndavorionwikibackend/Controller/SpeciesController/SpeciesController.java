package com.example.dndavorionwikibackend.Controller.SpeciesController;


import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Service.SpeciesService.SpeciesService;
import com.example.dndavorionwikibackend.Translation.SpeciesTranslator.SpeciesTranslator;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
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

    @CrossOrigin
    @Transactional
    @DeleteMapping("/speciesdeletebyid/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") long speciesId) {
        Optional<Species> speciesExist = Optional.ofNullable(this.speciesService.findById(speciesId));
        if (speciesExist.isPresent()) {
            this.speciesService.deleteById(speciesId);
            return ResponseEntity.ok("Deleted species");
        }else{
            return ResponseEntity.notFound().build();
        }

    }

    @CrossOrigin
    @DeleteMapping("speciesideletename/{name}")
    public String deleteByName(@PathVariable("name") String speciesName) {
        return "Entity deleted by name " + speciesName;
    }

}
