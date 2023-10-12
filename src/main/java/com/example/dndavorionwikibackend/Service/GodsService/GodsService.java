package com.example.dndavorionwikibackend.Service.GodsService;

import com.example.dndavorionwikibackend.Model.Gods.Gods;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.GodsRepository.GodsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GodsService {

    private GodsRepository godsRepository;

    public List<Gods> findAll() {
        return godsRepository.findAll();
    }

    public Gods findByGodsId(long godsId){
        return godsRepository.findGodsByGodsId(godsId);
    }

}
