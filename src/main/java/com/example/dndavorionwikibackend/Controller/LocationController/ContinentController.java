package com.example.dndavorionwikibackend.Controller.LocationController;


import com.example.dndavorionwikibackend.Model.Gods.Gods;
import com.example.dndavorionwikibackend.Model.Locations.Continent;
import com.example.dndavorionwikibackend.Repositories.LocationRepository.ContinentRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/location/continent")
public class ContinentController {

    private final ContinentRepository continentRepository;


    public ContinentController(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public List<Continent> listAll() {
        List<Continent> listContinents = continentRepository.findAll();

        return listContinents;
    }
}
