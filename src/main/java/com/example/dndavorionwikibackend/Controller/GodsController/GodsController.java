package com.example.dndavorionwikibackend.Controller.GodsController;

import com.example.dndavorionwikibackend.DTO.GodsDTO.GodsDTO;
import com.example.dndavorionwikibackend.Model.Gods.Gods;
import com.example.dndavorionwikibackend.Service.GodsService.GodsService;
import com.example.dndavorionwikibackend.Translation.GodsTranslator.GodsTranslator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/gods")
public class GodsController {


    private final GodsService godsService;

    private final GodsTranslator godsTranslator;

    public GodsController(GodsService godsService, GodsTranslator godsTranslator) {
        this.godsService = godsService;
        this.godsTranslator = godsTranslator;
    }


    @CrossOrigin
    @GetMapping(value = "/all")
    public Set<GodsDTO> listAll() {
        return godsService.findAll()
                .stream()
                .map(godsTranslator::godsToGodsDTO)
                .collect(Collectors.toSet());
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<GodsDTO> listById(@PathVariable("id") long godsId) throws Exception {

        return ResponseEntity.ok(godsTranslator.godsToGodsDTO(godsService.findByGodsId(godsId)));
    }
}
