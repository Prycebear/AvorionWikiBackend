package com.example.dndavorionwikibackend.Controller.LocationController;

import com.example.dndavorionwikibackend.DTO.LocationDTO.LocationsDTO;
import com.example.dndavorionwikibackend.DTO.LocationDTO.NationsDTO;
import com.example.dndavorionwikibackend.Model.LocationsModels.Locations;
import com.example.dndavorionwikibackend.Model.LocationsModels.Nation;
import com.example.dndavorionwikibackend.Service.LocationService.LocationService;
import com.example.dndavorionwikibackend.Service.LocationService.NationService;
import com.example.dndavorionwikibackend.Translation.LocationTranslator.LocationsTranslator;
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
@RequestMapping("/location/locations")
public class LocationsController {

    private final LocationService locationService;

    private final LocationsTranslator locationsTranslator;


    public LocationsController(LocationService locationService, LocationsTranslator locationsTranslator) {
        this.locationService = locationService;
        this.locationsTranslator = locationsTranslator;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addLocations(@RequestBody Locations locations) throws Exception {
        locationsTranslator.locationsToLocationsDTO(locationService.save(locations));
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public Set<LocationsDTO> listAll() {
        return locationService.findAll()
                .stream()
                .map(locationsTranslator::locationsToLocationsDTO)
                .collect(Collectors.toSet());
    }

    @CrossOrigin
    @GetMapping("/locationId/{id}")
    public ResponseEntity<LocationsDTO> listById(@PathVariable("id") long locationId) {
        return ResponseEntity.ok(locationsTranslator.locationsToLocationsDTO(locationService.findById(locationId)));
    }

    @CrossOrigin
    @GetMapping("/locationsname/{name}")
    public ResponseEntity<LocationsDTO> listById(@PathVariable("name") String locationsName) {
        return ResponseEntity.ok(locationsTranslator.locationsToLocationsDTO(locationService.findByName(locationsName)));
    }
}
