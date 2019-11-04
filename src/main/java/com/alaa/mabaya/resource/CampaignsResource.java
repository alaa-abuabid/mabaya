package com.alaa.mabaya.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alaa.mabaya.model.Campaign;
import com.alaa.mabaya.repository.CampaignRespository;

@RestController
@RequestMapping(value = "/campaigns")
public class CampaignsResource {

	@Autowired
	CampaignRespository campaignRepository;
	
	
	@PostMapping(value = "/create")
	public Campaign create(@RequestBody  Campaign campaign) {
		campaignRepository.save(campaign);
		return campaignRepository.findFirst1ByOrderByIdDesc();
	}
	
}
