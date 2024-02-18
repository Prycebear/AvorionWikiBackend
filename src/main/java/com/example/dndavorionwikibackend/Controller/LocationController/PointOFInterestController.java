package com.example.dndavorionwikibackend.Controller.LocationController;

import com.example.dndavorionwikibackend.DTO.LocationDTO.NationsDTO;
import com.example.dndavorionwikibackend.DTO.LocationDTO.PointOfInterestDTO;
import com.example.dndavorionwikibackend.Model.LocationsModels.Nation;
import com.example.dndavorionwikibackend.Model.LocationsModels.PointOfInterest;
import com.example.dndavorionwikibackend.Service.LocationService.NationService;
import com.example.dndavorionwikibackend.Service.LocationService.PointsOfInterestService;
import com.example.dndavorionwikibackend.Translation.LocationTranslator.NationTranslator;
import com.example.dndavorionwikibackend.Translation.LocationTranslator.PointOfInterestTranslator;
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
@RequestMapping("/location/poi")
public class PointOFInterestController {

    private final PointsOfInterestService pointsOfInterestService;

    private final PointOfInterestTranslator pointOfInterestTranslator;


    public PointOFInterestController(PointsOfInterestService pointsOfInterestService, PointOfInterestTranslator pointOfInterestTranslator) {
        this.pointsOfInterestService = pointsOfInterestService;
        this.pointOfInterestTranslator = pointOfInterestTranslator;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addNation(@RequestBody PointOfInterest nation) throws Exception {
        pointOfInterestTranslator.pointOfInterestToPointOfInterestDTO(pointsOfInterestService.save(nation));
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public Set<PointOfInterestDTO> listAll() {
        return pointsOfInterestService.findAll()
                .stream()
                .map(pointOfInterestTranslator::pointOfInterestToPointOfInterestDTO)
                .collect(Collectors.toSet());
    }

    @CrossOrigin
    @GetMapping("/poiid/{id}")
    public ResponseEntity<PointOfInterestDTO> listById(@PathVariable("id") long poiId) {
        return ResponseEntity.ok(pointOfInterestTranslator.pointOfInterestToPointOfInterestDTO(pointsOfInterestService.findById(poiId)));
    }

    @CrossOrigin
    @GetMapping("/poiName/{name}")
    public ResponseEntity<PointOfInterestDTO> listById(@PathVariable("name") String poiName) {
        return ResponseEntity.ok(pointOfInterestTranslator.pointOfInterestToPointOfInterestDTO(pointsOfInterestService.findByName(poiName)));
    }
}
