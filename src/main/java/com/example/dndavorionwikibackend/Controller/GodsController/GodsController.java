package com.example.dndavorionwikibackend.Controller.GodsController;

import com.example.dndavorionwikibackend.Model.Gods.Gods;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.GodsRepository.GodsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/gods")
public class GodsController {

    private final GodsRepository godsRepository;


    public GodsController(GodsRepository godsRepository) {
        this.godsRepository = godsRepository;


    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public List<Gods> listAll() {
        List<Gods> listGods = godsRepository.findAll();

        return listGods;
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Gods> listById(@PathVariable("id") long godsId){

        Gods gods = godsRepository.findGodsByGodsId(godsId);
        return ResponseEntity.ok(gods);

    }
}
