package com.example.dndavorionwikibackend.Service.GodsService;

import com.example.dndavorionwikibackend.Model.Gods.Gods;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.GodsRepository.GodsRepository;
import com.example.dndavorionwikibackend.Repositories.SpeciesRepositories.SpeciesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GodsService {

    private GodsRepository godsRepository;

    public GodsService(GodsRepository godsRepository) {
        this.godsRepository = godsRepository;
    }

    public List<Gods> findAll() {
        return godsRepository.findAll();
    }

    public Gods findByGodsId(long godsId) throws Exception {
        Optional<Gods> godExist = godsRepository.findById(godsId);
        if(!godExist.isPresent()){
            throw new Exception("God doesnt exist with given id");
        }
        return godsRepository.findGodsByGodsId(godsId);
    }

}
