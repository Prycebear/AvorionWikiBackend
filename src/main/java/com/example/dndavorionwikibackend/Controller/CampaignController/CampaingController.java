package com.example.dndavorionwikibackend.Controller.CampaignController;

import com.example.dndavorionwikibackend.Model.Campaign.Campaign;
import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.example.dndavorionwikibackend.Repositories.CamapignRepository.CampaignRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/campaign")
public class CampaingController {

    private final CampaignRepository campaignRepository;


    public CampaingController(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addCampaign(@RequestBody Campaign campaign) {
        campaignRepository.save(campaign);
    }


    @CrossOrigin
    @GetMapping(value = "/all")
    public List<Campaign> listAll() {
        List<Campaign> listCampaigns = campaignRepository.findAll();

        return listCampaigns;
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Campaign> listById(@PathVariable("id") long campaignId) {
        Campaign campaign = campaignRepository.findCampaignByCampaignId(campaignId);
        return ResponseEntity.ok(campaign);
    }
}
