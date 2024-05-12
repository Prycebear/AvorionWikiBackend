package com.example.dndavorionwikibackend.Controller.MagicController;

import com.example.dndavorionwikibackend.DTO.MagicDTO.MagicDTO;
import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Magic.Magic;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Service.MagicService.MagicService;
import com.example.dndavorionwikibackend.Translation.MagicTranslator.MagicTranslator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/magic")
public class MagicController {

    private final MagicService magicService;

    private final MagicTranslator magicTranslator;

    public MagicController(MagicService magicService, MagicTranslator magicTranslator) {
        this.magicService = magicService;
        this.magicTranslator = magicTranslator;
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public Set<MagicDTO> listAll() {
        return magicService.findAll()
                .stream()
                .map(magicTranslator::magicToMagicDTO)
                .collect(Collectors.toSet());
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addMagic(@RequestBody Magic magic) throws Exception {
        magicTranslator.magicToMagicDTO(magicService.saveMagic(magic));
    }

    @CrossOrigin
    @GetMapping("/magicid/{id}")
    public ResponseEntity<MagicDTO> listById(@PathVariable("id") long magicId) throws Exception {
        return ResponseEntity.ok(magicTranslator.magicToMagicDTO(magicService.findMagicById(magicId)));
    }

    @CrossOrigin
    @GetMapping("/magicname/{name}")
    public ResponseEntity<MagicDTO> listByName(@PathVariable("name") String magicName) throws Exception {
        return ResponseEntity.ok(magicTranslator.magicToMagicDTO(magicService.findMagicByName(magicName)));
    }
}
