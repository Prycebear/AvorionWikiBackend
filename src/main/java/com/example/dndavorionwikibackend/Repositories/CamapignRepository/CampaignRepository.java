package com.example.dndavorionwikibackend.Repositories.CamapignRepository;

import com.example.dndavorionwikibackend.Model.Campaign.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    Campaign findCampaignByCampaignId(long campaignId);

    Campaign findCampaignByCampaignName(String campaignName);
}
